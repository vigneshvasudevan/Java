package src.basics;

public class a08Functions {

    /*
     * Functions are re-usable piece of code
     * syntax:
     * <return value> functionName (<args>) {
     * // business logic goes here
     * return something
     * }
     * 
     */

    static boolean isPrimeNumber(int num) {
        for (int i = 2; i < num; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isOdd(int num) {
        return (num % 2 != 0);
    }

    static boolean isLeapYear(int year) {
        if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
            return false;
        }
        return true;
    }


    // Recursive function: A function calling itself
    static int fibonacci(int num) {
        if (num <= 2) {
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    static int factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }

    // Functions with variable length args aka variadic functions
    static void print(String... messages) {

    }
    
    public static boolean isPalindrome(String input) {
        String s = input.toUpperCase();
        int length = s.length();
        int mid = Math.floorDiv(length, 2);
        for (int i = 0 ; i <= mid; i++) {
            if (s.charAt(i) != s.charAt(length - 1- i)) {
                return false;
            }
        }
        return true;
    }

   public static void printVowConstantCount(String s) {
        int vowCount = 0;
        for (int i = 0; i < s.length(); i ++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                vowCount++;
                break;
            }
        }
        System.out.format("vowel count = %d\n", vowCount);
        System.out.format("constant count = %d\n", s.length() - vowCount);
    }

   public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam"));
        System.out.println(isPalindrome("Hello"));
        printVowConstantCount("");
    }
}
    
    

    

