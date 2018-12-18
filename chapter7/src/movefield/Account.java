package movefield;

public class Account {
    private AccountType mType;
    // step0. 如果有多个函数都使用到了mInterestRate字段，需要先运用self encapsulate进行自我封装
    private double mInterestRate;

    public Account(AccountType mType) {
        this.mType = mType;
    }

    double interestForAmountDays(double amount, int days) {
        return  mInterestRate * amount * days /365;
    }

    double interestForAmountYears(double amount, int years) {
        return  mInterestRate * amount * years;
    }
}