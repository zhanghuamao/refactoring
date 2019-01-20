package after.pullupmethod;

import junit.framework.TestCase;

import java.util.Date;

public class VipCustomerTest extends TestCase {
    private VipCustomer mVipCustomer;

    public void setUp() throws Exception {
        Date last = new Date(2019, 1, 18);
        mVipCustomer = new VipCustomer(last, 200);
    }

    public void testCreateBill() {
        Date end = new Date(2019, 1, 19);
        System.out.println(mVipCustomer.createBill(end));
    }
}