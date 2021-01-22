/**
 * @author Olivia Feldman
 * PerfectNum Class is used to find a perfect number and displays factors of the perfect number
 *
 */

public class PerfectNum {
    /*
        finds perfect numbers and returns sums up the factorials
        @param args are an int to sum its factorials
     */
    public int isPerfect(int number) {
              int  sum = 0; //re-initialize the sum to zero

            for (int i = 1; i < number; i++) { //loop to include all positive numbers up to "number"
                if (number % i == 0) { //loop to find numbers that are divisible

                        sum = sum + i; //adding all divisible numbers

                }

            }

        return sum;
    }
    //function displays factors of the perfect number
    public void displayPerfect(int num){
        for (int i = 1; i < num;i++)
            if (num % i == 0 )

            System.out.print(i + " " );

    }
}
