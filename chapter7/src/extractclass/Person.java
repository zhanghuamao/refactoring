package extractclass;

public class Person {
    // step0. 将电话号码相关的行为分离到一个独立类中
    private String mName;
    private String mOfficeAreaCode;
    private String mOfficeNumber;

    public String getmName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getOfficeAreaCode() {
        return mOfficeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.mOfficeAreaCode = officeAreaCode;
    }

    public String getOfficeNumber() {
        return mOfficeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.mOfficeNumber = officeNumber;
    }
}
