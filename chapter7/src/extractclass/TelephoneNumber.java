package extractclass;

// step1. 创建电话号码的类
public class TelephoneNumber {
    // step3. 搬移字段
    private String mOfficeAreaCode;
    private String mOfficeNumber;

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
