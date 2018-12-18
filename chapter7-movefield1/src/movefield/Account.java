package movefield;

public class Account {
    private AccountType mType;
    // step0. 把表示利率的mInterestRate搬移到AccountType类去
    // private double mInterestRate;

    public Account(AccountType mType) {
        this.mType = mType;
    }

    double interestForAmountDays(double amount, int days) {
        // step2. 删除源字段, 替换新字段
        return  mType.getInterestRate() * amount * days /365;
    }
}