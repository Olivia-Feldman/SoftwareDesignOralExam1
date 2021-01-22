/**
 * this class is a driver class to test Computus class's methods and functions
 */


import java.util.Scanner;
public class Main {
    /**
     * this function in takes in a user input and uses the Computus class to determine the date of easter for that year
     * @param args
     */
    public static void main(String[] args){
      Scanner input= new Scanner(System.in); // Scanner class is called to have input from the command line
        System.out.print("please enter a year  ");
        String num = input.nextLine();

        int year = Integer.parseInt(num);
        Computus e = new Computus(year); //craetes and instance of this class
       e.printdate();
        e.countDate();




    }



}
