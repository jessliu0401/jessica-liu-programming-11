import java.util.Date;

public class Deposit {
    private double amount;
    private Date date;
    private String account;

    Deposit(double amount, Date date, String account){
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public double getAmount() {
        return amount;
    }

    //test
    //requires: deposits arraylist
    //modifies: nothing
    // effect: print out items in deposits arraylist( will print blank if there's no items)
    public String toString(){
        return "Deposit of:" + amount + " Date:" + date + " into account: " + account + "]\n";
    }
}
