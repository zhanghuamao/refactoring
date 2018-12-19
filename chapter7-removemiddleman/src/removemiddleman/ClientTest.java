package removemiddleman;

import junit.framework.TestCase;

public class ClientTest extends TestCase {
    private Client mClient;

    public void setUp() throws Exception {
        Person person = new Person("John");
        person.setDepartment(new Department(new Person("Tom")));
        mClient = new Client(person);
    }

    public void testGetManager() {
        System.out.println(mClient.toString() + " manager is "+ mClient.getManager().toString());
    }
}