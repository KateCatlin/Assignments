package com.mycalculator.java;

/**
 * Created by katecatlin on 9/13/14.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

//checking to see if this forks...

import  java.util.Scanner;

public class MyCalculator {

    public static int yourChoice;
    public static double num1, num2;
    public static boolean keepGoing = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);



        while (keepGoing) {
            System.out.println("Entered the while loop");
            MyCalculator.getYourChoice();
            switch (yourChoice) {
                case 1:
                    System.out.println("You chose addition!");
                    System.out.println("please enter a number to add:");
                    num1 = in.nextDouble();
                    System.out.println("Please enter a second number to add:");
                    num2 = in.nextDouble();
                    System.out.println("The sum is: " + sum(num1, num2));
                    break;
                case 2:
                    System.out.println("You chose subtraction!");
                    System.out.println("please enter a number:");
                    num1 = in.nextDouble();
                    System.out.println("Please enter the number to subtract:");
                    num2 = in.nextDouble();
                    System.out.println("The answer is: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("You chose multiplication!");
                    System.out.println("please enter a number:");
                    num1 = in.nextDouble();
                    System.out.println("Please enter a second number:");
                    num2 = in.nextDouble();
                    System.out.println("The answer is: " + multiply(num1, num2));
                    break;
                case 4:
                    System.out.println("You chose division!");
                    System.out.println("please enter a number:");
                    num1 = in.nextDouble();
                    System.out.println("Please enter a second number:");
                    num2 = in.nextDouble();
                    System.out.println("The quotient is: " + divide(num1, num2));
                    break;
                case 5:
                    System.out.println("You chose square root!");
                    System.out.println("please enter a number:");
                    num1 = in.nextDouble();
                    System.out.println("The square root is: " + squareroot(num1));
                    break;
            }

            MyCalculator.getKeepGoingQ();
        }
        System.out.println("Thanks for using this calculator!");
    }


    public static int getYourChoice() {
        Scanner in = new Scanner(System.in);

        System.out.println("What kind of function would you like to perform? \n Press ONLY the number:");
        System.out.println("'1' for addition");
        System.out.println("'2' for subtraction");
        System.out.println("'3' for multiplication");
        System.out.println("'4' for division");
        System.out.println("'5' to find a square root");

        if (in.hasNextInt()) {
            System.out.println("it's an int!");
            yourChoice = in.nextInt();
            if (yourChoice <= 5 && yourChoice >= 1) {
                //System.out.println("You chose: " + yourChoice);
            } else {
                System.out.println("Sorry, that's not an option. Please choose a number between 1 and 5, and type only the number! \n");

                MyCalculator.getYourChoice();
            }
        } else {
            System.out.println("Sorry, that's not an option. Please choose a number between 1 and 5, and type only the number! \n");

            MyCalculator.getYourChoice();
        }
        return yourChoice;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }
    public static double multiply(double num1, double num2) {
        return num1*num2;
    }
    public static double divide(double num1, double num2) {
        return num1/num2;
    }
    public static double squareroot(double num1) {
        return Math.sqrt(num1);
    }

    public static int getKeepGoingQ() {
        System.out.println("Would you like to ask another question?");
        System.out.println("TO QUIT, press 1. otherwise press any other number.");
        Scanner in = new Scanner(System.in);
        int keepGoingQ = in.nextInt();
        if (keepGoingQ == 1) keepGoing = false;
        return 0;
    }
}