package after.pullupmethod;

import java.util.Date;

public class RegularCustomer extends Customer {
    public RegularCustomer(Date last, double amount) {
        super(last, amount);
    }

//    public double createBill(Date date) {
//        double interest = getInterest(lastBillDate, date);
//        double total = addBill(mChargeAmount, interest);
//        return total;
//    }

    double getInterest(Date start, Date end) {
        long duration = end.getTime() - start.getTime();
        if (duration > ONE_DAY) {
            return 0.1;
        }
        return 0.2;
    }
}
