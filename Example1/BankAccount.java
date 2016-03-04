/**
 * Created by Jeff on 2/24/2016.
 */
 
 //This reference: Line 41
 
public class BankAccount {

    private double balance, interestRate, interest;

    public BankAccount(double startBalance, double intRate)
    {
        balance = startBalance;
        interestRate = intRate;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void addInterest()
    {
        balance = balance + (balance / interestRate);
    }

    public double getBalance() {
        return balance;
    }

    public double getInterest() {
        return interestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
