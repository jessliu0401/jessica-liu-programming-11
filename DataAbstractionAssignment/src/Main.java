import java.util.Date;

public class Main {
    public static void main (String args[]){
        Date date = new Date();
Customer yuji = new Customer("yuji", 12345, 100.0,100.0  );
yuji.deposit(10.0,date,"Saving");
System.out.println(yuji.getdeposits());
System.out.println(yuji.getSavingBalance());
    }
}
