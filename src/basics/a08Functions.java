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

    static void printDay(int date, int month, int year) {
        if (year < 0 || month < 1 || month > 12) {
            return;
        }
        int validDate = 30;
        if (isOdd(month)) {
            validDate = 31;
        } else {
            if (month == 2) {
                validDate = isLeapYear(year) ? 29 : 28;
            }
        }

        if (date < 1 || date > validDate) {
            return;
        }

        // write your code here
        // 3/4/2
        // year = 2; month = 4; date = 3
        // 1/1/1 -> 1/2/1 =

        int curDay = 0;
        for (int curYear = 1; curYear < year; curYear++) {
            curDay = isLeapYear(curYear) ? curDay + 2 : curDay + 1;
            curDay = curDay % 7;
        }

        for (int curMonth = 1; curMonth < month; curMonth++) {
            if (curMonth % 2 == 0) {
                if (curMonth == 2) {
                    curDay += isLeapYear(year) ? 29 : 28;
                } else {
                    curDay += 30;
                }
            } else {
                curDay = curDay + 31;
            }
            curDay = curDay % 7;
        }
        curDay += date;
        int day = curDay % 7;
        System.out.format("%d/%d/%d is ", date, month, year);
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }

    }

    public static void main(String[] args) {
        printDay(2, 3, 1);
        printDay(2, 2, 2);
        printDay(2, 3, 4);
        printDay(2, 4, 101);
        printDay(2, 1, 2023);
    }
}
