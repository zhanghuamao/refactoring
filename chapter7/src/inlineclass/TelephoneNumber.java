package inlineclass;

public class TelephoneNumber {
    private String mOfficeAreaCode;
    private String mOfficeNumber;

    String getAreaCode() {
        return mOfficeAreaCode;
    }

    void setAreaCode(String officeAreaCode) {
        this.mOfficeAreaCode = officeAreaCode;
    }

    String getNumber() {
        return mOfficeNumber;
    }

    void setNumber(String officeNumber) {
        this.mOfficeNumber = officeNumber;
    }
}
