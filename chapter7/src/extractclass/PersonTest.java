package extractclass;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person mPerson;

    public void setUp() throws Exception {
        mPerson = new Person();
        mPerson.setOfficeNumber("028-111222");
        mPerson.setOfficeAreaCode("001-000-111");
    }

    public void tearDown() throws Exception {
    }

    public void testSetName() {
    }

    public void testGetOfficeAreaCode() {
        System.out.println("testGetOfficeAreaCode : " + mPerson.getOfficeAreaCode());
    }

    public void testGetOfficeNumber() {
        System.out.println("testGetOfficeNumber : " + mPerson.getOfficeNumber());
    }
}