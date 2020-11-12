/**
 * @author Yulianna Torres
 * @since 11/09/2020
 *
 * Class Description:
 * BankStatement sets the framework for a bank statement, but gets printed in BankManager class.
 *
 * Assumptions:
 * 1) Bank Manager prints out bank statements
 */

public class BankStatement {
    private String startingSavingsBalance;
    private String startingCheckingsBalance;
    private String startingCreditBalance;
    private StringBuffer transaction;

    /**
     * Default Constructor
     */
    BankStatement(){
        transaction = new StringBuffer();
    }

    /**
     * Constructor
     * @param startingSavingsBalance starting savings balance
     */
    BankStatement(String startingSavingsBalance){
        setStartingSavingsBalance(startingSavingsBalance);
        transaction = new StringBuffer();
        transaction.append("");
    }


    // Setters and Getters
    /**
     * Set Starting Savings Balance
     * @param startingSavingsBalance starting savings balance
     */
    public void setStartingSavingsBalance(String startingSavingsBalance){
        this.startingSavingsBalance = startingSavingsBalance;
    }

    /**
     * Set Starting Checkings Balance
     * @param startingCheckingsBalance starting checkings balance
     */
    public void setStartingCheckingsBalance(String startingCheckingsBalance){
        this.startingCheckingsBalance = startingCheckingsBalance;
    }

    /**
     * Set Starting Credit Balance
     * @param startingCreditBalance starting credit balance
     */
    public void setStartingCreditBalance(String startingCreditBalance){
        this.startingCreditBalance = startingCreditBalance;
    }


    /**
     * Get Starting Savings Balance
     * @return starting savings balance
     */
    public String getStartingSavingsBalance(){
        return startingSavingsBalance;
    }

    /**
     * Get Starting Checkings Balance
     * @return starting checkings balance
     */
    public String getStartingCheckingBalance(){
        return startingCheckingsBalance;
    }

    /**
     * Get Starting Credit Balance
     * @return starting credit balance
     */
    public String getStartingCreditBalance(){
        return startingCreditBalance;
    }


    //Methods
    /**
     * Append the Transaction
     * @param log log to be appended to transaction list
     */
    public void appendTransaction(String log){
        transaction.append(log + "\n");
    }

    /**
     * Get Transaction File
     * @return list of transactions
     */
    public StringBuffer getTransaction(){
        return transaction;
    }


    //bank manager bank statement function
    /**
     * toString returns parameters as strings
     * @return bank manager parameters as strings
     */
    @Override
    public String toString() {
        return ("\nStarting Balances" +
                "\nSavings Balance:" + startingSavingsBalance +
                "\nCheckings Balance:" + startingCheckingsBalance +
                "\nCredit Balance:" + startingCreditBalance +
                "\n\n" + transaction.toString());
    }
}