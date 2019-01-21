package after.pullupconstructorbody;

import junit.framework.TestCase;

public class ManagerTest extends TestCase {
    private Manager mManager;
    public void setUp() throws Exception {
        mManager = new Manager("Tom", "210", 5);
    }

    public void testGetManagerInfo() {
        System.out.println(mManager.getManagerInfo());
    }
}