/**
 * @author: olivia Feldman
 * @purpose: class extends the Account class and adds loan features and methods for a loan
 */



public class LoanAccount extends Account
{



    private double loan;  //variable to store the loan the holder has
    private double interest; // variable of interest of the loan
    private double payment;  //variable for holder to


    //constructor for the loan class
    public LoanAccount(String holder, double balance, double accountNumber,double loan, double interest, double payment) {
        super(holder, balance, accountNumber);

        //initializing variables
        setLoan(loan);
        setInterest(interest);
        setPayment(payment);
        setHolder(holder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    //getter and setters for loan
    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    // getter and setters interest
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    //getter and setters payment

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    /**
     *
     * @param interest
     * @param loan
     * @return
     */

    public  double addInterestToLoan( double interest, double loan){

        double loan_interest = interest * loan;

        setLoan(loan_interest);
        return  loan_interest;
    }

    /**
     *
     * @param payment
     * @return
     */
    public double payment2loan(double payment){

        loan = loan - payment;
        setLoan(loan);
        return loan;

    }
    /**
     * @purpose: prints account holder information
     */

    public void printInfo(){

        System.out.print("Account Holder: "+getHolder());
        System.out.println("Account Number:   " +getAccountNumber());
        System.out.println(" Account Balance:  " + getBalance());
    }
}
