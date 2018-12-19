package inlineclass;

public class Person {
    private String mName;
    // step2. 移动字段
    private String mOfficeAreaCode;
    private String mOfficeNumber;

    public String getTelephoneNumber() {
        return  ("(" + getOfficeAreaCode() + ") " + getOfficeNumber());
    }

    String getOfficeAreaCode() {
        return getAreaCode();
    }

    void setOfficeAreaCode(String officeAreaCode) {
       setAreaCode(officeAreaCode);
    }

    String getOfficeNumber() {
        return getNumber();
    }

    void setOfficeNumber(String officeNumber) {
        setNumber(officeNumber);
    }

    // step1. 声明TelephoneNumber中所有可见函数
    String getAreaCode() {
        return mOfficeAreaCode;
    }

    void setAreaCode(String officeAreaCode) {
        mOfficeAreaCode = officeAreaCode;
    }

    String getNumber() {
        return mOfficeNumber;
    }

    void setNumber(String officeNumber) {
        mOfficeNumber = officeNumber;
    }
}