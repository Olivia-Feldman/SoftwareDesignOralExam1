/**
 * @author: Olivia Feldman
 * @purpose: class is a subclass of the Account class. Allows holder to withdraw a
 */


public class CheckingsAccount extends  Account {

    /**
     *
     * @param holder
     * @param balance
     * @param accountNumber
     */

    public CheckingsAccount(String holder, double balance, double accountNumber,double withdrawl) {
        super(holder, balance, accountNumber);
    }
    private double withdrawl;

    public double getWithdrawl() {
        return withdrawl;
    }

    /**
     *
     * @param withdrawl
     */
    public void setWithdrawl(double withdrawl) {
        this.withdrawl = withdrawl;
    }

    /**
     * Prints Over Draw error when holder withdraws more then the maximum ammount of $500
     * @param withdrawl
     */
    public  void  overDraw(double withdrawl){
        if (getWithdrawl() > 500.00){
            System.out.println("Over drawl Error! Withdrawl limit of $500.00");
            setBalance(getBalance());

        }
        else{
               setBalance(getBalance() - withdrawl);
        }

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
