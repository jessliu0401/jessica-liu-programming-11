import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits = new ArrayList<>();
    private ArrayList<Withdraw> withdraws = new ArrayList<>();
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    public ArrayList<Deposit> getdeposits(){
        return deposits;
    }
    public ArrayList<Withdraw> getwithdraws(){
        return withdraws;
    }
    public double getCheckBalance(){
        return checkBalance;
    }

    public ArrayList<Deposit> getDeposits() {
        return deposits;
    }

    public ArrayList<Withdraw> getWithdraws() {
        return withdraws;
    }

    public double getSavingBalance(){
        return savingBalance;
    }


    Customer(){
        //create default constructor
        name = "test";
        accountNumber = 11111;
        checkBalance = 100.0;
        savingBalance = 100.0;
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        this.checkBalance = checkDeposit;
        this.savingBalance = savingDeposit;


    }
/*requires: positive double, a date, account string
modifies: this, deposits
effects: add to deposit list, add amt to balance
 */

    public double deposit(double amt, Date date, String account){ //account:checking/saving
        Deposit deposit = new Deposit(amt, date, account);
        deposits.add(deposit);//cannot access private arraylist from same class
        if (account.equals(SAVING)){
            savingBalance = savingBalance+ amt;
        }
        else {checkBalance = checkBalance + amt;
    }
        return amt;}
/*requires: positive double for amount, new date(), account(checking/saving)
modifies: this, withdraws
effects: deletes amt from balance if there's sufficient balance for withdraws, add one item to withdraw list,
return amt
 */
    //if there's not enough money to do the whole withdraw in the account,
// a new item would still be created that writes 0.0 as its amount
        public double withdraw(double amt, Date date, String account) {
            double x = 0.0;
            // if the account has not gone over overdraft
            if (savingBalance > OVERDRAFT ||checkBalance > OVERDRAFT ) {
                //saving account
                if (account.equals(SAVING)) {
                    if (savingBalance - amt < OVERDRAFT) {
                        x = 0.0; }
                    else { savingBalance = savingBalance - amt;
                   x = amt;}}
                //*******************************************************
                else { if(checkBalance - amt < OVERDRAFT) {
                     x = 0.0; }
                    else{checkBalance = checkBalance - amt;
                     x = amt;} }

                withdraws.add(new Withdraw( x, date, account));
                return amt;}

            //if not enough money in either account
            else { withdraws.add(new Withdraw(0.0, date, account));
                return amt; }
        }



//requires: account string, a positive double
    //modifies: nothing
    //effects: checks if the customer tried to withdraw a certain amount will it go over the overdraft amount
    private boolean checkOverdraft(String account, double amt){
            if(account.equals(CHECKING)){
                if (checkBalance - amt < OVERDRAFT){
                    return true; }
                else return false;
            }
            else { if (savingBalance - amt < OVERDRAFT){
                return false;}
                else return true; }



    }
    //do not modify
    public void displayDeposits(){
        for(Deposit d : deposits){
            System.out.println(d);
        }
    }
    //do not modify
    public void displayWithdraws(){
        for(Withdraw w : withdraws){
            System.out.println(w);
        }
    }

}
