package src.basics;

import java.util.Scanner;

// What are loops?
// Loops are a way to do the same work over and over again

// How do we write loops?
// For & while

public class a07Loops {
    public static void main(String[] args) {

        // Syntax :
        // for (initializer; condition ; increment/decrement)
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        scan.close();
        // Given a number check if it's a prime number (using 'for' loop)
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.format("Number  =%d is not prime", num);
                break;
            }
        }

        // syntax:
        // while (condition) {
        // // business logic
        // }
        // Given a number check if it's a prime number (using 'while' loop)
        int i = 2;
        while (i < num) {
            if (num % i == 0) {
                System.out.format("Number  =%d is not prime", num);
                break;
            }
            ++i;
        }

        // Given a number 'n' , print all even numbers starting from 1 till 'n'
        num = 10;
        for (i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.format("%d", i);
            }
        }

        // Print 6 table
        /*
         * 6 * 1 = 6
         * 6 * 2 = 12
         * 
         * 
         * 
         * 
         * 6 * 20 = 120
         * 
         */
        int tablebase = 6;
        for (i = 1; i <= 20; i++) {
            System.out.format(" %d * %d = %d\n", tablebase, i, tablebase * i);
        }

        // Given a number find all factors of it
        // Example: if n = 30, then factors are 2, 3, 5, 6, 10, 15, 30
        num = 30;
        for (i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.format("%d", i);
            }
        }

        // given a number find sum of its digits
        num = 12345;
        int sum = 0;
        while (num > 0) {
            sum += (num % 10); // sum = sum + (num % 10);
            num /= 10; // num = num / 10;
        }
        System.out.format("Sum = %d", sum);
    }

}
