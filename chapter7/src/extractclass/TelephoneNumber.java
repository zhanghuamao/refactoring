package extractclass;

// step1. 创建电话号码的类
public class TelephoneNumber {
    // step3. 搬移字段
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
