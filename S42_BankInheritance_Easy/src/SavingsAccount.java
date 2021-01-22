/**
 * @author : Olivia Feldman
 * @purose: this class allows the holder to have a savings account that allows the account to apply interest
 */





public class SavingsAccount extends Account {

    /**
     *
     * @param holder
     * @param balance
     * @param accountNumber
     * @param interest
     */
    public SavingsAccount(String holder, double balance, double accountNumber, double interest) {
        //initializes variables
        super(holder, balance, accountNumber);
        setHolder(holder);
        setBalance(balance);
        setAccountNumber(accountNumber);
        setInterest(interest);
    }

    private double interest; //variable for interest on savings account

    //getter and setters for interest variable

    public double getInterest() {
        return interest;
    }
    public void setInterest(double interest) {
        this.interest = interest;
    }

    /**
     *
     * @param
     * @return updated balance with the interest gain
     */
    public void addInterest() {

        setBalance(getBalance() * interest);

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
