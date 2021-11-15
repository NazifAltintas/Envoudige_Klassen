package be.intecbrussel.opdrachten;

import java.time.DayOfWeek;
import java.util.Scanner;

public class WeekdaysAndMonths {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter order of days between 1-7 for day choosing...");
        int orderOfDays = keyboard.nextInt();

        DayOfWeek[] dayArr = DayOfWeek.values();
        DayOfWeek yourDay = dayArr[orderOfDays - 1];

        System.out.println("Your day is " + yourDay);

        System.out.println("\n How many days later do you want to know?..");
        int after = keyboard.nextInt();

        DayOfWeek afterDay = yourDay.plus(after);
        System.out.println(after + " day(s) later " + afterDay);

    }


}

