/**
 * @author: olivia feldman
 * @purpose: the purpose of this program is to demonstrate the concept of inheritance in programming
 */


public class Account {


    //constructor of Account initilizes the class variables
    public Account(String  holder, double balance, double accountNumber, double withdraw1){

        setHolder(holder); //intiatlizes the holder name
        setBalance(balance); //initializes the balance
        setAccountNumber(accountNumber); //intitalizes the account number
        withdraw = withdraw1; //initialize


    };

    private String holder; // variable for the name of the holder of the account
    private double accountNumber; //variable of holders account number
    private double balance; // balance variable to keep track of holder's total balance
    private double withdraw; //withdrawl from the account

    public Account(String holder, double balance, double accountNumber) {
    }


    //getter and setter for Balance
    public double getBalance() {
        return balance;
    }

    public double setBalance(double balance) {
        this.balance = balance;
        return balance;
    }

    //getter and setter for accountNumber
    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        this.accountNumber = accountNumber;
    }

    //getter and setter for holder
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    //method to add a deposit to the total balance
  public double deposit(double deposit){
        deposit = getBalance() + deposit;

        return deposit;
    }

    public double withdraw(double withdrawl){

        return withdrawl = getBalance() - withdrawl;
    }


}
