/**
 * @author : olivia Feldman
 * @purpose: to allow a banker to use all checkings, loan, and savings account
 */


public class Bank extends Account{


    public Bank(String holder, double balance, double accountNumber,double savingsInterest,double loanInterest,double payment,double loan,double withdrawl) {
        super(holder, balance, accountNumber);
        setHolder(holder);
        setAccountNumber(accountNumber);
        setBalance(balance);
        setLoanAccountInterest(loanInterest);
        setSavingsAccountInterest(savingsInterest);
        setLoan(loan);
        setLoanpayment(payment);




    }
    //variables for banking system for checking, saving and loan accounts
    private double loanAccountInterest;
    private double savingsAccountInterest;
    private double loan;
    private double loanpayment;
    private double withdrawChecking;

    //getters and setters for variables
    public double getWithdrawChecking() {
        return withdrawChecking;
    }

    public void setWithdrawChecking(double withdrawChecking) {
        this.withdrawChecking = withdrawChecking;
    }
    public double getLoanpayment() {
        return loanpayment;
    }

    public void setLoanpayment(double loanpayment) {
        this.loanpayment = loanpayment;
    }


    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getSavingsAccountInterest() {
        return savingsAccountInterest;
    }

    public void setSavingsAccountInterest(double savingsAccountInterest) {
        this.savingsAccountInterest = savingsAccountInterest;
    }



    public double getLoanAccountInterest() {
        return loanAccountInterest;
    }

    public void setLoanAccountInterest(double loanAccountInterest) {
        this.loanAccountInterest = loanAccountInterest;
    }


    //creating holders checkings, savings and loan account

    CheckingsAccount oliviachecking = new CheckingsAccount(getHolder(),getBalance(),getAccountNumber(),getWithdrawChecking());
    SavingsAccount oliviasavings = new SavingsAccount(getHolder(),getBalance(),getAccountNumber(),getSavingsAccountInterest());
    LoanAccount olivialoan = new LoanAccount(getHolder(),getBalance(),getAccountNumber(),getLoanAccountInterest(),getLoan(),getLoanpayment());


}
