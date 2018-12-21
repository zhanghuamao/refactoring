package introducelocalextension;

import introducelocalextension.Client;
import junit.framework.TestCase;

import java.util.Date;

public class ClientTest extends TestCase {
    private Client mClient;

    public void setUp() throws Exception {
        mClient = new Client();
    }

    public void testGetNextDate() {
        Date next = mClient.getNextDate();
        System.out.println("testGetNextDate " + next.getYear()
        + "-" + next.getMonth() + "-" + next.getDate());
    }
}