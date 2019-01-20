package after.pullupfield;

import junit.framework.TestCase;

public class EngineerTest extends TestCase {
    private Engineer mEngineer;

    public void setUp() throws Exception {
        mEngineer = new Engineer();
        mEngineer.setName("Jack");
    }

    public void testGetName() {
        System.out.println("Engineer : " + mEngineer.getName());
    }
}