// I had to use JUnit 4 instead of 5 here
// because my system kept on running into problems when trying to download junit 5
import org.junit.Before;
import org.junit.Test;

import java.util.Date;


import  static org.junit.Assert.assertEquals;

public class Testcase {
    Customer bob;

    @Before
    public void setup(){
        bob = new Customer("bob", 12345, 100.0, 100.0);
        Date date = new Date();
    }
    @Test
    public void testCheckingDeposit(){
        Date date = new Date();
        //check if balance starts with 100.0 dollars
        assertEquals(bob.getCheckBalance(), 100.0,0.0);
        //try to put in 10 dollars in checking account
        bob.deposit(10.0,date,"Checking");
        //check if balance is equals to 110 dollars
        assertEquals(bob.getCheckBalance(),110.0,0.0);
        //check if there's one more item in deposit arraylist
        assertEquals(bob.getDeposits().size(), 1);
    }

    @Test
    public void testSavingDeposit(){
        Date date = new Date();
        assertEquals(bob.getSavingBalance(), 100.0,0.0);
        bob.deposit(10.0,date,"Saving");
        assertEquals(bob.getSavingBalance(),110.0,0.0);
        assertEquals(bob.getDeposits().size(), 1);
    }

    @Test
    public void testSavingWithdraw(){
        Date date = new Date();
        //withdraw money
        assertEquals(bob.getSavingBalance(),100.0,0.0);
        bob.withdraw(10.0,date,"Saving");
        assertEquals(bob.getSavingBalance(),90.0,0.0);
        assertEquals(bob.getWithdraws().size(), 1);
        //try to withdraw too much that it goes over to overdraft(No withdraw would be made as it is rejected)
        bob.withdraw(200.0,date,"Saving");
        assertEquals(bob.getSavingBalance(),90.0,0.0);
        assertEquals(bob.getWithdraws().size(), 2);//(one more item will stil be added to withdraw list)
    }

    @Test public void testCheckingWithdraw(){
            Date date = new Date();
            //withdraw money
            assertEquals(bob.getSavingBalance(),100.0,0.0);
            bob.withdraw(10.0,date,"Checking");
            assertEquals(bob.getCheckBalance(),90.0,0.0);
            assertEquals(bob.getWithdraws().size(), 1);
            //try to withdraw too much that it goes over to overdraft(No withdraw would be made as it is rejected)
            bob.withdraw(200.0,date,"Checking");
            assertEquals(bob.getCheckBalance(),90.0,0.0);
            assertEquals(bob.getWithdraws().size(), 2);
        //(one more item will still be added to withdraw list, just that the amount will said 0 as it was rejected)

    }

    @Test
    public void testDepositToString(){
            Date date = new Date();
            //make sure there's nothing in the list
            assertEquals(bob.getdeposits().size(), 0);
        // deposit smt
            Deposit deposit = new Deposit(10.0, date,"Saving");
            // take the object to toString method
            String s = deposit.toString();
            //compare between actual and expected
            assertEquals(s,"Deposit of:" + "10.0" + " Date:" + date + " into account: " + "Saving" +"]\n");
    }

    @Test
    public void testWithdrawToString(){
        Date date = new Date();
        //make sure there's nothing in the list
        assertEquals(bob.getwithdraws().size(), 0);
      //create a new withdraw
        Withdraw withdraw = new Withdraw(10.0, date,"Saving");
        //try to do toString
        String s = withdraw.toString();
        //compare
        assertEquals(s,"Withdraw of:" + "10.0" + " Date:" + date + " from account: " + "Saving" +"]\n");
}

}
