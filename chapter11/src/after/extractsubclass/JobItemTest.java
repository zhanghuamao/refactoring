package after.extractsubclass;

import junit.framework.TestCase;

public class JobItemTest extends TestCase {
    private JobItem laborItem;
    private JobItem item;

    public void setUp() throws Exception {
       Employee labor = new Employee(80);
       laborItem = new LaborItem(2,labor);
       item = new JobItem(50,2);
    }

    public void testGetTotalPrice() {
        System.out.println("get labor total price : " + laborItem.getTotalPrice());
        System.out.println("get hourly total price : " + item.getTotalPrice());
    }
}