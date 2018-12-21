package introduceforeignmethod;

import java.util.Date;

public class Client {
    private Date mPreviousEnd = new Date(2019, 1, 1);

    Date getNextDate() {
        Date next = nextDay(mPreviousEnd);
        return next;
    }

    Date nextDay(Date data) {
        // foreign method, should be on date
        return new Date(data.getYear(), data.getMonth(), (data.getDate() + 1));
    }
}
