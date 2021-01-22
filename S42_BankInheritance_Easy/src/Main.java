/**
 * @author: Olivia Feldman
 * @purpose: To test the superclass Account and subclasses loan, checking and savings Account
 */
public class Main {

    /**
     * @param : String[] args
     *
     */
   public static void main(String[] args) {

       //testing functionality of tests

        SavingsAccount test1 = new SavingsAccount("Olivia,Feldman", 300, 2020, .02);
        test1.deposit(500);
        test1.withdraw(200);
        test1.printInfo();

        System.out.println("                       ");
        CheckingsAccount test2 = new CheckingsAccount("Olivia,Feldman", 600,2020,700);
        test2.overDraw(555);
        test2.printInfo();
       System.out.println("                       ");
       LoanAccount test3 = new LoanAccount("Olivia,Feldman", 400, 2020,500,.4,100);
       test3.setPayment(300);
       test3.printInfo();




   }
}