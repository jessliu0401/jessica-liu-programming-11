import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.Date;

public class Customer {
    private int accountNumber;
    private ArrayList<Deposit> deposits;
    private ArrayList<Withdraw> withdraws;
    private double checkBalance;
    private double savingBalance;
    private double savingRate;
    private String name;
    public static final String CHECKING = "Checking";
    public static final String SAVING = "Saving";
    private final int OVERDRAFT = -100;

    Customer(){
        //create default constructor
    }
    Customer(String name, int accountNumber, double checkDeposit, double savingDeposit){
        this.name = name;
        this.accountNumber = accountNumber;
        //what should checkDeposit and savingDeposit do

    }
/*requires: positive double, a date, account string
modifies: deposit list, balance
effects: one more item in deposit list, balance + amt
 */
//写test
    public double deposit(double amt, Date date, String account){ //account:checking/saving
        Deposit deposit = new Deposit(amt, date, account);
        deposits.add(deposit);//cannot access private arraylist from same class
        if (account.equals(SAVING)){
            savingBalance = savingBalance+ amt;
        }
        else {checkBalance = checkBalance + amt;
    }
        return amt;}
/*requires: positive double, date, account
modifies: withdraw arraylist, balance
effect： if there's enough money in account to withdraw, one more item in deposit list, balance - amt
if there's not enough money in account, one more item in deposit list, balance = -100
 */
    // 写test
        public double withdraw(double amt, Date date, String account) {
            // if the account has not gone over overdraft
            if (savingBalance > OVERDRAFT ||checkBalance > OVERDRAFT ) {
                //saving account
                if (account.equals(SAVING)) {
                    //when there's not enough money in the account to do the whole withdrawal
                    if (savingBalance - amt < OVERDRAFT) {
                        //withdraw until the account reaches -100
                        OVERDRAFT + double x = savingBalance;//??????
                        amt = x;
                        savingBalance = OVERDRAFT; }
                    else { savingBalance = savingBalance - amt; }}
                //*******************************************************
                else { if(checkBalance - amt < OVERDRAFT) {
                        checkBalance - double x = -100;//??????
                    amt = x;
                    checkBalance = OVERDRAFT; }
                    else{checkBalance = checkBalance - amt;} }

                withdraws.add(new Withdraw(amt, date, account));
                return -amt;}
            //if not enough money in either account
            else {
                withdraws.add(new Withdraw(0.0, date, account));
                return 0.0; }
        }




    private boolean checkOverdraft(String account){
            if(account.equals(CHECKING)){
                if (checkBalance > 0.0){
                    return false; }
                else return true;
            }
            else { if (savingBalance > 0.0){
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
