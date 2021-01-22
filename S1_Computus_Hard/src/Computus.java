
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
import  org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


/**
 * Computus class takes a year and determines the date in which easter occured that year
 * It also determines the number of times a specific dates has occured
 */


public class Computus {

    private int day = 0; // variable to determine the day
    private int month = 0; // variable to determine the month


    //constructor for teh class calls the compute function
    Computus(int year) {

        compute(year);

    }
    //getter and setters for the two private variables for this class
    void setDay(int day1) {
        day = day1;
    }

    int getDay() {
        return day;
    }

    void setMonth(int month1) {
        month = month1;
    }

    int getMonth() {
        return month;
    }
    //print date function prints the day and month of the computed easter date
    void printdate(){
        System.out.println(getDay() + " " + month_string(getMonth()));
    }

    //Compute function computes easter day when given a year
    void compute(int year) {
        int Y = year;
        int a = Y % 19;
        int b = Y / 100;
        int c = Y % 100;
        int d = b / 4;
        int e = b % 4;
        int f = (b + 8) / 25;
        int g = (b - f + 1) / 3;
        int h = ((19 * a) + b - d - g + 15) % 30;
        int i = c / 4;
        int k = c % 4;
        int l = (32 + (2 * e) + (2 * i) - h - k) % 7;
        int m = (a + (11 * h) + (22 * l)) / 451;
        int month = (h + l - (7 * m) + 114) / 31;
        int day = ((h + l - (7 * m) + 114) % 31) + 1;

        setMonth(month);
        setDay(day);


    }

//function converts the numeric months of April and march to a string
    String month_string(int month) {
        if (month == 3) {
            return "March";
        }

        if (month == 4) {
            return "April";
        } else {
            return "error";
        }
    }

//function finds the number of times easter dates will occur in a cycle
    void  countDate() {
            int i;
            int j;

        int[] sum1 = new int[31];
        int [] sum2 = new int[31];

        for ( i = 0;i < 31;i++){

            sum1[i] = 0;

        }

        for ( i = 0;i < 31;i++){

            sum2[i] = 0;

        }




        for ( i = 0; i <= 5700000; i++) {
            compute(i);


            for (j = 1; j <= 31; j++){

                if ( getDay() == j && getMonth() ==3){

                    sum1[j-1] = sum1[j-1] + 1;

                }

                if ( getDay() == j && getMonth() ==4){
                    sum2[j-1] = sum2[j-1] +1;

                }


            }
        }


        System.out.println("Dates of Easter in a cycle                ");
        for (i = 1; i <= sum1.length;i++) {
            if (sum1[i-1] > 0) {
                System.out.println("March " + i + " " + sum1[i-1]);
            }
        }

        System.out.println("                                 ");
        for (i = 1; i <= sum2.length;i++) {
            if (sum2[i-1] > 0) {
                System.out.println("April " + i + " " + sum2[i-1]);
            }
        }
    }








}