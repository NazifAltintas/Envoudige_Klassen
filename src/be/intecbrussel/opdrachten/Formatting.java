package be.intecbrussel.opdrachten;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Formatting {

    public static void main(String[] args) throws ParseException {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a date as format DD/MM/YYYY");
        String userDate = keyboard.nextLine();


        SimpleDateFormat userFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy-MM-dd");


        String newDate = newFormat.format(userFormat.parse(userDate));
        System.out.println(newDate);


    }
}

