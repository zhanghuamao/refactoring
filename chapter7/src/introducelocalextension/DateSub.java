package introducelocalextension;

import java.util.Date;

public class DateSub extends Date {
    public DateSub (int year, int month, int date) {
        super(year, month, date);
    }

    public static Date nextDay(Date data) {
        return new Date(data.getYear(), data.getMonth(), (data.getDate() + 1));
    }
}