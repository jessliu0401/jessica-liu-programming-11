import java.util.Date;

public class Withdraw {
    private double amount;
    private Date date;
    private String account;

    Withdraw(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }
//test
//requires: withdraws arraylist
//modifies: nothing
// effect: print out items in withdraws arraylist( will print blank if there's no items)
    public String toString(){
        return "Withdraw of:" + this.amount + " Date:" + this.date + " from account: " + this.account +"]\n";
    }
}
