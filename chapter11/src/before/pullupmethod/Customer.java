package before.pullupmethod;

import java.util.Date;

public class Customer {
    protected Date lastBillDate;
    protected double mChargeAmount;

    protected static final long ONE_DAY = 1 * 24 * 60 * 60 * 1000;

    public Customer(Date last, double amount) {
        lastBillDate = last;
        mChargeAmount = amount;
    }

    public double addBill(double amount, double interest) {
        double total = amount - amount * interest;
        return total;
    }
}
