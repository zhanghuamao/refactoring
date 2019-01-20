package before.pullupmethod;

import junit.framework.TestCase;

import java.util.Date;

public class RegularCustomerTest extends TestCase {

    private RegularCustomer mRegularCustomer;

    public void setUp() throws Exception {
        Date last = new Date(2019, 1, 18);
        mRegularCustomer = new RegularCustomer(last, 200);
    }

    public void testCreateBill() {
        Date end = new Date(2019, 1, 19);
        System.out.println(mRegularCustomer.createBill(end));
    }
}