package inlineclass;

public class TelephoneNumber {
    private String mOfficeAreaCode;
    private String mOfficeNumber;

    String getOfficeAreaCode() {
        return mOfficeAreaCode;
    }

    void setOfficeAreaCode(String officeAreaCode) {
        this.mOfficeAreaCode = officeAreaCode;
    }

    String getOfficeNumber() {
        return mOfficeNumber;
    }

    void setOfficeNumber(String officeNumber) {
        this.mOfficeNumber = officeNumber;
    }
}
