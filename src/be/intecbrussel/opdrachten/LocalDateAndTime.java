package be.intecbrussel.opdrachten;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateAndTime {
    public static void main(String[] args) {

        LocalDate dateOfBirth=LocalDate.of(1990,04,20);

        int dayOfYear=dateOfBirth.getDayOfYear();
        System.out.println(dayOfYear+". day of the year...");

        int dayOfMonth=dateOfBirth.getDayOfMonth();
        System.out.println(dayOfMonth+". day of the month...");

        DayOfWeek dayOfWeek=dateOfBirth.getDayOfWeek();
        System.out.println("It was "+dayOfWeek);


        boolean leapYear=dateOfBirth.isLeapYear();

        if (leapYear){
            System.out.println(dateOfBirth.getYear()+"is leap year...");
        }else{
            System.out.println(dateOfBirth.getYear()+" is not leap year...");
        }

    }


}
