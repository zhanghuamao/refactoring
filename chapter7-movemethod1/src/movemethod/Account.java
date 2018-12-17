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

    // 每一种类型账户都有自己的透支金额计划规则
    double overdraftCharge() {
        double result;
        if (mType.isPremium()) {
            result = 10;
            if (mDaysOverDrawn > 7) {
                result += (mDaysOverDrawn - 7) * 0.85;
                return result;
            }
        } else {
            result = mDaysOverDrawn * 1.75;
        }
        return result;
    }

    public double bankCharge() {
        double result = 4.5;
        if (mDaysOverDrawn > 0) {
            result += overdraftCharge();
        }
        return result;
    }
}