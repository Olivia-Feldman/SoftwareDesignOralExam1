



/**
 * @author olivia feldman
 * class is to test Similarity classes
 */



public class Main {

    public static void main(String[] args) throws Exception {
        Similarity c = new Similarity();

        System.out.print(c.cosine(new double[]{1.0, 2.0, 3.0}, new double[]{2.0,6.0,3.0}));

        String string1 = "karolin";
        String string2 = "kathrin";
        System.out.print("\n");
        System.out.print(c.hamming(string1,string2));
        System.out.print("\n");



    }


}

