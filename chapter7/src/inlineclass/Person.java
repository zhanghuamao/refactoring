package inlineclass;

public class Person {
    private String mName;
    private TelephoneNumber mTelephoneNumber = new TelephoneNumber();

    public String getTelephoneNumber() {
        return  ("(" + getOfficeAreaCode() + ") " + getOfficeNumber());
    }

    String getOfficeAreaCode() {
        return mTelephoneNumber.getOfficeAreaCode();
    }

    void setOfficeAreaCode(String officeAreaCode) {
        mTelephoneNumber.setOfficeAreaCode(officeAreaCode);
    }

    String getOfficeNumber() {
        return mTelephoneNumber.getOfficeNumber();
    }

    void setOfficeNumber(String officeNumber) {
        mTelephoneNumber.setOfficeNumber(officeNumber);
    }
}
