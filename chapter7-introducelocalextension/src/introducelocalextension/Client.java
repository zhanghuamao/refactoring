package introducelocalextension;

import java.util.Date;

public class Client {
    private Date mPreviousEnd = new Date(2019, 1, 1);

    Date getNextDate() {
        Date next = DateSub.nextDay(mPreviousEnd);
        return next;
    }
}