package be.intecbrussel.opdrachten;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class TimesWithTimeZones {
    public static void main(String[] args) {

        ZoneId currentPlace = ZoneId.of("Europe/Brussels");
        System.out.println(currentPlace);

        ZonedDateTime currentPlaceTime = ZonedDateTime.now(currentPlace);
        System.out.println("current place: " + currentPlaceTime);

        ZoneId londonZone = ZoneId.of("Europe/London");
        System.out.println("\n" + londonZone);

        ZonedDateTime londonZoneTime = ZonedDateTime.now(londonZone);
        System.out.println("London Time: " + londonZoneTime);

        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        System.out.println("\n" + sydneyZone);

        ZonedDateTime sydneyZoneTime = ZonedDateTime.now(sydneyZone);
        System.out.println("Sydney Time: " + sydneyZoneTime);

        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        System.out.println("\n" + adelaideZone);

        ZonedDateTime adelaideZoneTime = ZonedDateTime.now(adelaideZone);
        System.out.println("Adelaide Time: " + adelaideZoneTime);

        ZoneOffset timeZone = ZoneOffset.ofHours(-4);
        System.out.println("\n"+timeZone);

        ZonedDateTime timeZoneTime=ZonedDateTime.now(timeZone);
        System.out.println("UTC"+timeZone+"    "+timeZoneTime);

    }
}
