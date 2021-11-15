package be.intecbrussel.opdrachten;

import java.time.Instant;

public class InstantExercise {
    public static void main(String[] args) {

        Instant now=Instant.now();
        System.out.format(" %-1s \n","current time "+now);

        Instant new_Time=now.plusSeconds(7).plusMillis(5).plusNanos(3);
        System.out.format(" %-1s","new time is  "+new_Time);



    }
}
