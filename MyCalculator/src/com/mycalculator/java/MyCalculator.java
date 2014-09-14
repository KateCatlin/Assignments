package com.mycalculator.java;

/**
 * Created by katecatlin on 9/13/14.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import  java.util.Scanner;

public class MyCalculator {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        boolean KeepGoing = true;
        int i;
        int yourChoice = 0;
        int yourChoice2;

        while (KeepGoing) {
            System.out.println("Entered the while loop");
            MyCalculator.methodPrintOpening();

            System.out.println("Still in the loop");

            yourChoice2 = yourChoice+1;
            System.out.println(yourChoice2);
            KeepGoing = false;

        }
        System.out.println("Thanks for using this calculator!");
    }


    public int methodPrintOpening() {
        Scanner in = new Scanner(System.in);
        int yourChoice;

        System.out.println("What kind of function would you like to perform? \n Press ONLY the number:");
        System.out.println("'1' for addition");
        System.out.println("'2' for subtraction");
        System.out.println("'3' for multiplication");
        System.out.println("'4' for division");
        System.out.println("'5' to find a square root");

        if (in.hasNextInt()) {
            System.out.println("it's an int!");
            yourChoice = in.nextInt();
            System.out.println(yourChoice);
        } else {
            System.out.println("Sorry, that's not an option. Please choose a number between 1 and 5, and type only the number! \n");

            MyCalculator.methodPrintOpening();
        }
        return yourChoice;
    }
}