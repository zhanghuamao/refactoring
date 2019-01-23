package before.extractsubclass;

import junit.framework.TestCase;

public class JobItemTest extends TestCase {
    private JobItem laborItem;
    private JobItem item;

    public void setUp() throws Exception {
       Employee labor = new Employee(80);
       Employee hourly = new Employee(0);
       laborItem = new JobItem(50,2,labor,true);
       item = new JobItem(50,2,hourly,false);
    }

    public void testGetTotalPrice() {
        System.out.println("get labor total price : " + laborItem.getTotalPrice());
        System.out.println("get hourly total price : " + item.getTotalPrice());
    }
}