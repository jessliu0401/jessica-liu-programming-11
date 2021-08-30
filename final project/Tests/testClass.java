import org.junit.Before;
import org.junit.Test;
import sample.Controller;
import sample.Funding;
import sample.Purchase;
import sample.Teacher;

import static org.junit.Assert.assertEquals;

public class testClass {

    @Before
    public void setUp(){
    }



    @Test
    public void testPurchaseUpdate(){
        Controller.schoolBalance = 1000;
        Controller.addPurchase("100");
        assertEquals(Controller.schoolBalance,900);
    }

    @Test
    public void testPayUpdate(){
        Controller.schoolBalance = 1000;
        Controller.addPay("100");
        assertEquals(Controller.schoolBalance,900);

    }

    @Test
    public void testFundingUpdate(){
        Controller.schoolBalance = 1000;
        Controller.addDonate("100");
        assertEquals(Controller.schoolBalance,1100);
    }



}
