package com.mycalculator.java;

/**
 * Created by katecatlin on 9/13/14.
 */

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

//My big goal here was to find a way to continue operating on a number one already going, not just start fresh each time.
//My secondary goal here was to figure out methods, which was mildly successful. Still confused on static vs. nonstatic, etc
//hope I used most of them right but got the right answeres sooooooooooo. yeah.

import  java.util.Scanner;

public class MyCalculator {

    public static int yourChoice;
    public static int saveLatestSolutionq = 1;
    public static double num2, latestSolution;
    public static double num1 = 987654321;
    public static boolean keepGoing = true, savingLatestSolution = true;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (keepGoing) {
            while (savingLatestSolution) {
                //System.out.println("Entered the while loop");
                yourChoice = MyCalculator.getYourChoice();
                //System.out.println("yourChoice before cases is: " +yourChoice);
                switch (yourChoice) {
                    case 1:
                        //System.out.println("You chose addition!");
                        if (num1 == 987654321) {
                            num1 = getNum1();
                        } else num1 = latestSolution;
                        num2 = getNum2();
                        System.out.println(num1 + "+" + num2);
                        System.out.println("The sum is: " + sum(num1, num2));
                        latestSolution = sum(num1, num2);
                        MyCalculator.saveLatestSolution();
                        break;
                    case 2:
                        //System.out.println("You chose subtraction!");
                        //System.out.println("The latest solutions is " + latestSolution);
                        if (num1 == 987654321) {
                            num1 = getNum1();
                        }
                        num2 = getNum2();
                        System.out.println(num1 + "-" + num2);
                        System.out.println("The answer is: " + subtract(num1, num2));
                        latestSolution = subtract(num1, num2);
                        MyCalculator.saveLatestSolution();
                        break;
                    case 3:
                        //System.out.println("You chose multiplication!");
                        if (num1 == 987654321) {
                            num1 = getNum1();
                        } else num1 = latestSolution;
                        num2 = getNum2();
                        System.out.println("The answer is: " + multiply(num1, num2));
                        latestSolution = multiply(num1, num2);
                        MyCalculator.saveLatestSolution();
                        break;
                    case 4:
                        //System.out.println("You chose division!");
                        if (num1 == 987654321) {
                            num1 = getNum1();
                        } else num1 = latestSolution;
                        num2 = getNum2();
                        System.out.println("The quotient is: " + divide(num1, num2));
                        latestSolution = divide(num1, num2);
                        MyCalculator.saveLatestSolution();
                        break;
                    case 5:
                        //System.out.println("You chose square root!");
                        if (num1 == 987654321) {
                            num1 = getNum1();
                        } else num1 = latestSolution;
                        System.out.println("The square root is: " + squareroot(num1));
                        latestSolution = squareroot(num1);
                        MyCalculator.saveLatestSolution();
                        break;
                }
            }

            MyCalculator.keepGoingQuestion();
        }
        System.out.println("\nThanks for using this calculator!");}


    public static boolean checkIfDouble (Scanner input) {
        if (input.hasNextDouble()) {
            //System.out.println("Went through checkIfInteger.");
            return true;
        }
        else return false;
    }

    public static boolean checkIfInRange(int yourChoice) {
        //System.out.println("Went to checkIfInRange.");
        if (yourChoice<=5 && yourChoice>=1) {
            //System.out.println("Passed checkIfInteger.");
            return true;
        }
        else return false;
    }

    public static boolean checkIfInteger(Scanner input) {
        if (input.hasNextInt ()) {
            //System.out.println("Went through checkIfInteger.");
            return true;
        }
        else return false;
    }

    public static double divide(double num1, double num2) {
        return num1/num2;
    }

    public static double getNum1 () {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter your first number:");
        //System.out.println("you entered " + num1);
        if (checkIfDouble(in)) {
            num1 = in.nextDouble();
            //System.out.println("Went through hasNextDouble.");
        } else {
            System.out.println("Sorry that's not an option! Please enter a number: ");
            MyCalculator.getNum1();
        }

        return num1;
    }

    public static double getNum2 () {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter a second number:");
        //System.out.println("you entered " + num1);
        if (checkIfDouble(in)) {
            num2 = in.nextDouble();
            //System.out.println("Went through hasNextDouble.");
        } else {
            System.out.println("Sorry that's not an option! Please enter a number: ");
            MyCalculator.getNum2();
        }

        return num2;
    }

    public static int getYourChoice() {
        Scanner in = new Scanner(System.in);

        System.out.println("What kind of function would you like to perform? \n Press ONLY the number:");
        System.out.println("'1' for addition");
        System.out.println("'2' for subtraction");
        System.out.println("'3' for multiplication");
        System.out.println("'4' for division");
        System.out.println("'5' to find a square root");


        if (checkIfInteger(in)) {
            //System.out.println("it's an integer");
            yourChoice = in.nextInt();
            if (checkIfInRange(yourChoice)) {
                //System.out.println("... and it's in the range.");
            } else {
                System.out.println("Sorry that's not an option! Please select between 1 - 5.");
                MyCalculator.getYourChoice();
            }
        } else {
            System.out.println("Sorry that's not an option! You must press a number between 1 -5.");
            MyCalculator.getYourChoice();
        }

        //System.out.println("integer choice at end of getYourChoice() is:" + yourChoice);

        return yourChoice;
    }

    public static int keepGoingQuestion() {
        System.out.println("\nWould you like to ask another question?\n");
        System.out.println("TO QUIT, press 1. otherwise press any other key!\n");
        Scanner in = new Scanner(System.in);
        if (checkIfInteger(in)) {
            int keepGoingQ = in.nextInt();
            if (keepGoingQ == 1) keepGoing = false;
            return 0;}
        else keepGoing = false;
        return 0;
    }

    public static double multiply(double num1, double num2) {
        return num1*num2;
    }

    public static int saveLatestSolution () {
        System.out.println("\nWould you like to perform another operation on " + latestSolution + "?\n");
        System.out.println("If so, press 1. Otherwise, press any other key!\n");
        Scanner in = new Scanner(System.in);
        if (checkIfInteger(in)) {
            int saveLatestSolutionq = in.nextInt();
            if (saveLatestSolutionq == 1) {
                num1 = latestSolution;

            } else {
                System.out.println("ok, we'll start fresh!");
                savingLatestSolution = false;
            }
            }
        else {
            System.out.println("ok, we'll start fresh!");
            savingLatestSolution = false;
        }
        return 0;
    }

    public static double squareroot(double num1) {
        return Math.sqrt(num1);
    }

    public static double subtract(double num1, double num2) {
        return num1-num2;
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

}