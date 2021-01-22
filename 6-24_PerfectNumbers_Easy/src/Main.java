/**
 * @Author Olivia Feldman
 * Main class is used to call and test PerfectNum class
 *
 *
 */
 public class Main{
     /*
        this main class is used to test PerfectNum class
        @param args command line arguments are not used
      */
    public static void main(String[] args) {

        for (int i = 2; i < 1000; i++) {   //loop uses PerfectNum class to find perfect numbers from 1-1000
            PerfectNum test = new PerfectNum(); //creates test which is an instance of a class
            if (test.isPerfect(i) == i) {//condition to determine if perfect number
                 test.displayPerfect(i); //prints out multiples of perfect hum
                System.out.print(": are factors of   ");
                System.out.println(test.isPerfect(i))  ; //prints out perfect numbers

            }
        }
    }
}

