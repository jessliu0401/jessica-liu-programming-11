import org.junit.Before;
import org.junit.Test;
import sample.Funding;
import sample.Purchase;
import sample.Teacher;

import static org.junit.Assert.assertEquals;

public class testClass {

    @Before
    public void setUp(){
    }



    @Test
    public void testPurchaseToString(){
        Purchase purchase = new Purchase("testItem",100);
        String s = purchase.toString();
        assertEquals(s,"testItem\t\t\t- 100$");

    }

    @Test
    public void testFundingToString(){
        Funding funding = new Funding("testPatron" , 200);
        String f = funding.toString();
        assertEquals(f, "testPatron\t\t\t+200$");

    }

    @Test
    public void testTeacherToString(){
        Teacher bob = new Teacher("bobson", 3000);
        String a = bob.toString();
        assertEquals(a,"Pay to bobson\t\t3000$");
    }



}
