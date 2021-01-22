import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
/*
@author: olivia Feldman
@purpose: This class uses
 */

class SimilarityTest {

    @Test
    void cosine() throws Exception {
        //test and expectation values were taken from onlinemschoo.com
        assertEquals(0.8781,Similarity.cosine(new double[]{1.0, 2.0, 3.0}, new double[]{2.0,6.0,3.0}),.01);
        assertEquals(0.5142,Similarity.cosine(new double[]{1.4, 7.6, 5.8}, new double[]{5.9,1,3.0}),.01);
        assertEquals(0.9902,Similarity.cosine(new double[]{2.0, 4.0, 6.0}, new double[]{3.0,5.0,7.0}),.01);
        assertEquals(0.9573,Similarity.cosine(new double[]{5.0, 9.0, 2.0}, new double[]{4.0,5.0,3.0}),.01);
        assertEquals(0.7940,Similarity.cosine(new double[]{1.7, 3.4, 6.9}, new double[]{2.6,7.4,3.5}),.01);

    }

    @Test
    void hamming() throws Exception {
        //test and expectation values were taken from wikipedia.org/wiki/Hamming_distance
        assertEquals(3, Similarity.hamming("Karolin", "Kathrin"));

        assertEquals(3,Similarity.hamming("Karolin", "Kerstin"));
        assertEquals(4,Similarity.hamming("Kathrin", "Kerstin") );
        assertEquals(2, Similarity.hamming("1011101", "1001001"));
        assertEquals(3, Similarity.hamming("2173896", "2233796"));

    }

    @Test
    void euclidean() throws Exception {

        //test and expectation values are taken from WolframAlpha
        assertEquals(7.176,Similarity.euclidean( new double[]{1.5,3.5,2,2,8}, new double[]{3,3,2,2,1}),.01);
        assertEquals(4.123,Similarity.euclidean( new double[]{1.0,2.0,3.0}, new double[]{2,6,3}),.01);
        assertEquals(6.1644,Similarity.euclidean( new double[]{7.0,8,1}, new double[]{2.0,5,3}),.01);
        assertEquals(6.928,Similarity.euclidean( new double[]{6,6,6}, new double[]{2,2,2}),.01);
        assertEquals(1.732,Similarity.euclidean( new double[]{1,1,1}, new double[]{0,0,0}),1.01);

    }
}