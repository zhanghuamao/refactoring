package inlineclass;

public class Person {
    private String mName;
    private TelephoneNumber mTelephoneNumber = new TelephoneNumber();

    public String getTelephoneNumber() {
        return  ("(" + getOfficeAreaCode() + ") " + getOfficeNumber());
    }

    String getOfficeAreaCode() {
        return mTelephoneNumber.getAreaCode();
    }

    void setOfficeAreaCode(String officeAreaCode) {
        mTelephoneNumber.setAreaCode(officeAreaCode);
    }

    String getOfficeNumber() {
        return mTelephoneNumber.getNumber();
    }

    void setOfficeNumber(String officeNumber) {
        mTelephoneNumber.setNumber(officeNumber);
    }
}
