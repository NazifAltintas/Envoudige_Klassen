package be.intecbrussel.opdrachten;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LengthOfTime {

    public static void main(String[] args) {

        LocalDate dateOfBorn = LocalDate.of(1990, 4, 20);
        LocalDate nowDate = LocalDate.now();

        Period period = Period.between(dateOfBorn,nowDate);
        System.out.println("number of days: " + period.getDays());
        System.out.println("number of months: " + period.getMonths());
        System.out.println("number of years: " + period.getYears());

        long days= ChronoUnit.DAYS.between(dateOfBorn,nowDate);
        System.out.println("total number of days: "+days);

        long weeks= ChronoUnit.WEEKS.between(dateOfBorn,nowDate);
        System.out.println("total number of weeks: "+weeks);

        long months= ChronoUnit.MONTHS.between(dateOfBorn,nowDate);
        System.out.println("total number of months: "+months);
    }


}
