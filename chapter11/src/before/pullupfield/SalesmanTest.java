package before.pullupfield;

import junit.framework.TestCase;

public class SalesmanTest extends TestCase {
    private Salesman mSalesman;

    public void setUp() throws Exception {
        mSalesman = new Salesman();
        mSalesman.setName("Tom");
    }

    public void testGetName() {
        System.out.println("Salesman : " + mSalesman.getName());
    }
}