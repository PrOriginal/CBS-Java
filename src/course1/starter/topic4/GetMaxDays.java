package course1.starter.topic4;

import java.util.Calendar;

public class GetMaxDays {
    public static void main(String[] args) {
        byte monthOrder = 1;
        short year = 2024;

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, monthOrder); // calendarInstance.method(Class.Constant, var);
        cal.set(Calendar.YEAR, year);

        System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH) + " days");
    }
}
