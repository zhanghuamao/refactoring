package extractclass;

public class Person {
    // step0. 将电话号码相关的行为分离到一个独立类中
    private String mName;
    // private String mOfficeAreaCode;
    // private String mOfficeNumber;
    // step2. 建立电话号码类和Person类的连接
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
