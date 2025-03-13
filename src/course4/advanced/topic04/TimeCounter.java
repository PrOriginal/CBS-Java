package course4.advanced.topic04;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class TimeCounter {

    public static void main(String[] args) {
        LocalDateTime dateOfBirth = LocalDateTime.of(1998, 1, 16, 15, 33);

        System.out.println("Використано Period та Duration для обчислення:");
        countTimeMethod1(dateOfBirth);
        System.out.println("-------------------");
        System.out.println("Використано ChronoUnit та Period для обчислення:");
        countTimeMethod2(dateOfBirth);
    }

    public static void countTimeMethod1(LocalDateTime dateOfBirth) {
        LocalDateTime now = LocalDateTime.now();

        // Різниця в роках, місяцях і днях
        Period period = Period.between(dateOfBirth.toLocalDate(), now.toLocalDate());

        // Різниця в годинах, хвилинах і секундах
        Duration duration = Duration.between(dateOfBirth, now);

        // Кількість годин, хвилин і секунд
        long hours = duration.toHours() % 24;
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        printTimeCounted(period.getYears(), period.getMonths(), period.getDays(), hours, minutes,seconds);

    }

    public static void countTimeMethod2(LocalDateTime dateOfBirth){
        LocalDateTime now = LocalDateTime.now();

        Period period = Period.between(dateOfBirth.toLocalDate(), now.toLocalDate());

        long years = ChronoUnit.YEARS.between(dateOfBirth, now);
        long months = ChronoUnit.MONTHS.between(dateOfBirth, now) % 12;
//        long days = ChronoUnit.DAYS.between(dateOfBirth, now) % 30; // похибка, дає хибний результат
        long days = period.getDays();
        long hours = ChronoUnit.HOURS.between(dateOfBirth, now) % 24;
        long minutes = ChronoUnit.MINUTES.between(dateOfBirth, now) % 60;
        long seconds = ChronoUnit.SECONDS.between(dateOfBirth, now) % 60;

        printTimeCounted(years, months, days, hours, minutes,seconds);

    }

    public static void printTimeCounted(long years, long months, long days, long hours, long minutes, long seconds){
        System.out.println("Вам виповнилося " +
                years + " років, " +
                months + " місяців, " +
                days + " днів, " +
                hours + " години, " +
                minutes + " хвилин та " +
                seconds + " секунд.");
    }
}
