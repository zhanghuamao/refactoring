package movefield;

public class Account {
    private AccountType mType;
    private double mInterestRate;

    double interestForAmountDays(double amount, int days) {
        return  mInterestRate * amount * days /365;
    }
}
