package inlineclass;

import junit.framework.TestCase;

public class PersonTest extends TestCase {
    private Person mPerson;

    public void setUp() throws Exception {
        mPerson = new Person();
        mPerson.setOfficeNumber("111222");
        mPerson.setOfficeAreaCode("028");
    }

    public void tearDown() throws Exception {
    }

    public void testGetOfficeAreaCode() {
        System.out.println("testGetOfficeAreaCode : " + mPerson.getOfficeAreaCode());
    }

    public void testGetOfficeNumber() {
        System.out.println("testGetOfficeNumber : " + mPerson.getOfficeNumber());
    }

    public void testGetTelephoneNumber() {
        System.out.println("testGetTelephoneNumber : " + mPerson.getTelephoneNumber());
    }
}