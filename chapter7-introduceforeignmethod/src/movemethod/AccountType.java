package movemethod;

public class AccountType {
    private boolean mIsPremium;

    public AccountType(boolean isPremium) {
        this.mIsPremium = isPremium;
    }

    public boolean isPremium() {
        return mIsPremium;
    }

    /* public double overdraftCharge(int daysOverDrawn) {
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
    } */
    // 引用Account中的函数
    // Step1. 修改传入参数，测试
    public double overdraftCharge(Account account) {
        double result;
        if (isPremium()) {
            result = 10;
            if (account.getDaysOverDrawn() > 7) {
                result += (account.getDaysOverDrawn() - 7) * 0.85;
                return result;
            }
        } else {
            result = account.getDaysOverDrawn() * 1.75;
        }
        return result;
    }
}