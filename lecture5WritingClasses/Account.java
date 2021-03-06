import java.text.NumberFormat;

/** A class that represents a bank account with basic functionality
 *  like withdrawing and depositing. Based on the example
 *  from Lewis & Loftus, Java Software Solutions.
 */
public class Account {
    private final double RATE = 0.035;  // interest rate of 3.5%

    private long acctNumber;
    private double balance;
    private String name;

    /**
     * Sets up the account by defining its owner, account number,
     * and initial balance.
     * @param owner owner of the account
     * @param account account number
     * @param initial initial balance
     */
    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;
    }

    /**
     * Deposits the specified amount into the account. Returns the new balance.
     * @param amount amount to deposit
     * @return new balance
     */
    public double deposit(double amount) {
        balance = balance + amount;
        return balance;
    }

    /**
     * Withdraws the specified amount from the account and applies
     * the fee. Returns the new balance.
     * @param amount amount of money to withdraw
     * @param fee fee to pay for using ATM
     * @return new balance
     */
    public double withdraw(double amount, double fee) {
        balance = balance - amount - fee;
        return balance;
    }

    //-----------------------------------------------------------------
    //  Adds interest to the account and returns the new balance.
    //-----------------------------------------------------------------
    public double addInterest()
    {
        balance += (balance * RATE);
        return balance;
    }

    //-----------------------------------------------------------------
    //  Returns the current balance of the account.
    //-----------------------------------------------------------------
    public double getBalance()
    {
        return balance;
    }

    /**
     * Returns a one-line description of the account as a string.
     * @return a string with the info about the account
     */
    public String toString()  {
        //return name + ": " + balance;
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String formattedBalance = fmt.format(balance);
        return (acctNumber + "\t" + name + "\t" + formattedBalance);
    }

}
