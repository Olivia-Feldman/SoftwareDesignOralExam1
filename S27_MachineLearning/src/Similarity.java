import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

import java.text.DecimalFormat;

/**
 @author olivia Feldman
 @purpose to  this class is used to create functions to determine the similarity between data points
 */

public class Similarity {

    Similarity() {
    }

    ;  // constructor

    /**
     * @param array1 and array2
     * @return floating inter of the similarity that is equal to cos(theta)
     */
    static double cosine(double[] array1, double[] array2) throws Exception {

        double similar = 0.0; //variable to return the dot product of vectors
        double sum = 0.0; //variable to find dot product
        double magnitude1 = 0.0;
        double magnitude2 = 0.0;

        if (array1.length != array2.length) { //checks teh arrays dimension
            throw new Exception(" Vectors do not have the same dimensions");
        }

        for (int i = 0; i < array1.length; i++) { //calculates total sum and magnitudes
            magnitude1 = Math.pow(array1[i], 2) + magnitude1;
            magnitude2 = Math.pow(array2[i], 2) + magnitude2;


            sum = array1[i] * array2[i] + sum;
        }


        similar = sum / (Math.sqrt(magnitude1) * Math.sqrt(magnitude2)); //computer similarity between two vector


        return similar;
    }

    ;

    /**
     * @param string1
     * @param string2
     * @return
     * @throws Exception
     */
    static int hamming(String string1, String string2) throws Exception {

        int count = 0; // variable to count hamming distance

        if (string1.length() != string2.length()) {// checks to see if array lengths are the same
            throw new Exception("error: strings are not the same length"); // throws an error if they aren't
        }
        for (int i = 0; i < string1.length(); i++) { //loop iterates through string and compares values
            if (string1.charAt(i) != string2.charAt(i)) {
                count = count + 1;
            }

        }
        return count;

    }

    ;

    /**
     * @param array1
     * @param array2
     * @return distance between two points
     * @throws Exception
     */
    static double euclidean(double[] array1, double[] array2) throws Exception {
        double distance = 0.0; //stores distance values

        if (array1.length != array2.length) { //checks array lengths
            throw new Exception("Error: Array length is not the same"); //throws error if not the same
        }
        for (int i = 0; i < array1.length; i++) { //computes the distance between arrays

            distance = Math.pow(array1[i] - array2[i], 2) + distance;//calculated distance between vectors

        }

        return Math.sqrt(distance); //returns total distance
    }

}




