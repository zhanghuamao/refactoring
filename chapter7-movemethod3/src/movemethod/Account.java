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
            // Step 7. 检测引用点，替换新的方法，删除旧的，进行测试
            result += mType.overdraftCharge(mDaysOverDrawn);
        }
        return result;
    }
}