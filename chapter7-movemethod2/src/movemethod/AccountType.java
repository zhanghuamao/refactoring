package movemethod;

public class AccountType {
    private boolean mIsPremium;

    public AccountType(boolean isPremium) {
        this.mIsPremium = isPremium;
    }

    public boolean isPremium() {
        return mIsPremium;
    }

    // Step3. 拷贝overdraftCharge
    /* double overdraftCharge() {
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
    } */
    // Step4. 调整参数
    public double overdraftCharge(int daysOverDrawn) {
        double result;
        if (isPremium()) {
            result = 10;
            if (daysOverDrawn > 7) {
                result += (daysOverDrawn - 7) * 0.85;
                return result;
            }
        } else {
            result = daysOverDrawn * 1.75;
        }
        return result;
    }
}