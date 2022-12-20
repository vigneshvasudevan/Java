package src.basics;

import java.util.Scanner;

/*
why do we need a conditional statement?
Execute statement(s) when it meets one or more conditions
*/

public class a06ConditionalStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        // Check if given number is odd or even
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        // Another way to do this using ternary operator
        String ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println("Num is = " + ans);

        // Do something based on temperature
        System.out.println("Input the weather data");
        float temp = scan.nextFloat();
        if (temp < 25) {
            System.out.println("Go get yourself a soup");
        } else if (temp < 30) {
            System.out.println("Go for a walk");
        } else {
            System.out.println("Go get yourself an icecream");
        }

        System.out.println("Input a year");
        int year = scan.nextInt();

        // check if the given year is leap year or not
        // A year is leap year if and only if
        // 1. If it's divisible by 4
        // 2. If it's divisible by 100 then it must be divisible by 400
        // Otherwise it's non-leap year
        if (year < 1)
            System.out.println("Invalid year");

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Leap year");
            } else {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Non leap year");
                }
            }
        } else {
            System.out.println("Non leap year");
        }

        // Another way to check do the same leap year check
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            System.out.println("Not an leap year");
        } else {
            System.out.println("leap year");
        }
        scan.close();

    }
}
