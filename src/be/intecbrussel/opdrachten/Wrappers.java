package be.intecbrussel.opdrachten;

import java.math.BigInteger;
import java.util.Scanner;

public class Wrappers {


    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your social security number...");
        String input = keyboard.next();
        System.out.println("Your social security number is " + input);


        Integer string_Value = Integer.parseInt(input);
        int manipulated_Ssn = string_Value + 100;
        System.out.println("Your social security number + 100 = " + manipulated_Ssn);


        Integer bytes_Value = Integer.BYTES;
        System.out.println("\nBytes value of an integer:" + bytes_Value);
        Integer bits_Value = Integer.BYTES*8;
        System.out.println("Bits value of an integer:" + bits_Value);


    }

}