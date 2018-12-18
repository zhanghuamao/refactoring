package movemethod;

public class Account {
    private AccountType mType;
    private int mDaysOverDrawn;

    public Account(AccountType type) {
        this.mType = type;
    }

    public void setDaysOverDrawn(int daysOverDrawn) {
        this.mDaysOverDrawn = daysOverDrawn;
    }

    public int getDaysOverDrawn() {
        return mDaysOverDrawn;
    }

    public double bankCharge() {
        double result = 4.5;
        if (mDaysOverDrawn > 0) {
            // Step3. 修改传入参数
            result += mType.overdraftCharge(this);
        }
        return result;
    }
}