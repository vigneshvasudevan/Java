package src.basics;

public class a09Class {

    /* Class is a template or blueprint or DNA of a real world entity.
     * Class consists of data and the functions which operates on the data
     * An instance of the class is 'Object'. Every user defined class in java implicitly
     * inherits 'Object' class kept at java.lang package
    */

    public class Date {
        private int day; // Access specifier: default (when nothing is mentioned), public, private, protected
        private int month;
        private int year;

        public Date(int day, int month, int year) {
            if (!isValidDay(day, month, year)) {
                setToDefaultDate();
            } else {
                this.day = day;
                this.month = month;
                this.year = year;
            }
        }

        private void setToDefaultDate() {
            this.day = 1;
            this.month = 1;
            this.year = 1;
        }

        // A static member function can only call another static member function.@interface
        // A static member function can access only static data member
        private static boolean isValidYear(int year) {
            return year > 0;
        }

        private static boolean isValidMonth(int month) {
            return month > 0 && month <= 12;
        }

        private static boolean isValidDay(int day, int month, int year) {
            if(!isValidYear(year) || !isValidMonth(month)) {
                return false;
            }
            int validDays = getNumOfDays(month, year);
            return day > 0 && day <= validDays;
        }

        public static boolean isLeapYear(int year) {
            if (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)) {
                return false;
            }
            return true;
        }
        
        private static int getNumOfDays(int month, int year) {
            int numOfDays = 30;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numOfDays = 31;
                    break;
                case 2:
                    numOfDays = isLeapYear(year) ? 29 : 28;
                    break;
            }
            return numOfDays;
        }
        
        private static int getDay(int day, int month, int year) {
            int curDay = 0;
            for (int curYear = 1; curYear < year; curYear++) {
                curDay = isLeapYear(curYear) ? curDay + 2 : curDay + 1;
                curDay = curDay % 7;
            }

            for (int curMonth = 1; curMonth < month; curMonth++) {
                curDay += getNumOfDays(curMonth, year);
                curDay = curDay % 7;
            }
            curDay = curDay + day;
            curDay = curDay % 7;
            return curDay;
        }
        public void printWeekday() {
            System.out.format("%d/%d/%d is ", this.day, month, year);
            switch (getDay(this.day, this.month, this.year)) {
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
        
        static void printMonthlyCalendar(int month, int year) {
            if (!isValidDay(1, month, year)) {
                return;
            }
            int numOfDays = getNumOfDays(month, year);
            int startingDayOfMonth = getDay(1, month, year);
            System.out.format("Here is the monthly calendar of %d/%d\n", month, year);
            System.out.print("Sun\tMon\tTue\tWed\tThu\tFri\tSat\n");
            for(int i =0; i < startingDayOfMonth; i++) {
                System.out.print("\t");
            }
            int curDay = startingDayOfMonth;
            for (int i = 1; i <= numOfDays; i++) {
                System.out.format("%d\t", i);
                curDay += 1;
                if (curDay % 7 == 0) {
                    System.out.print("\n");
                }
            }
            System.out.print("\n");
        }

        @Override
        public String toString() {
            return Integer.toString(this.day) + "/" + Integer.toString(this.month) + "/" + Integer.toString(this.year);
        }
    }

    // Example for Has-a relationship among classes in Java. 
    // Student class having Date as its member. 
    public class Student {
        String name; // Default access mode: 'default'
        int id;
        int age;
        char gender;
        Date dob; // Student class containing 'Date' as it member. 
        int mobileNum;

        Student(int studentId, int studentAge, char gender, int number) {
            this.id = studentId;
            this.age = studentAge;
            this.gender = gender;
            this.mobileNum = isValidMob(number) ? number : -1;
        }

        void attendClass() {
            //some logic
            takeNotes();
        }

        private boolean isValidMob(long number) {
            return number >= 100000000l && number <= 9999999999l;
        }

        static void takeNotes() {
            // some logic
        }
    }


    // Another example for Has-a relationship. Here Time has Date
    public class Time {
        public Date date;
        public int hours;
        public int minutes;
        public int sec;
        public String timezone;

        Time(Date date, int hr, int min, int s, String timeZone) {
            this.date = date;
            this.hours  = isValidHrs(hr) ? hr : 0;
            this.minutes = isValidMinOrSec(min) ? min : 0;
            this.sec = isValidMinOrSec(s) ? s : 0;
            this.timezone = timeZone;
        }
        public void printTime() {
            System.out.format("Date is %s and wall clock time is %d:%d:%d %s\n", this.date.toString(), this.hours, this.minutes, this.sec, this.timezone);
        }

        private boolean isValidHrs(int hrs) {
            return hrs >= 0 && hrs < 24;
        }

        private boolean isValidMinOrSec(int minorSec) {
            return minorSec >= 0 && minorSec <60;
        }
    }


    public class MobilePhones {
        private int simCardSlots;
        private int batteryCapacity;
        private int screenSize;
        private String screenTech;

        MobilePhones(int simSlots, int batterySize, int screenSize, String screentMadeOf) {
            this.simCardSlots = simSlots;
            this.batteryCapacity = batterySize;
            this.screenTech = screentMadeOf;
            this.screenSize = screenSize;
        }
    }

    // Example for Is-a relationship. Here Samsung is extending the Mobilephone. 
    // Here Samsung is the derived/child class and MobilePhones is parent or base class
    public class Samsung extends MobilePhones {
        private int megaPixels;

        Samsung(int cameraQuality) {
            super(1, 4000, 6, "amoled");
            // base constructor call has to the first line at the constructor
            this.megaPixels = cameraQuality;
        }
        
        public int getMegaPixels() {
            return megaPixels;
        }
    }


    // Function overloading allows having function with same number but take different input args
    // Note: Two functions with same input args but different return type is not treated as overloads
    // Function overloading helps in achieving compile time polymorphism. It uses name mangling technique
    // behind the scenes to orchestrate that
    public class FunctionOverloading {
        public long add(int x, int y) {
            return x + y;
        }

        public float add(float x, float y) {
            return x + y;
        }

        public long add(int x, int y, int z) {
            return x + y + z;
        }
    }
    
    // Java doesn't support operator overloading
    

    public class GrandFather {
        public void shooting() {
            System.out.println("Grandfather shooting");
        }
    }

    public class Father extends GrandFather {

    }

    public class Mother {

    }

    // Multi-level inheritance. Son indirectly inheriting GrandFather
    public class Son extends Father {
        @Override
        // Function overriding allow runtime polymorphism
        // Here we override grandfather's shooting
        public void shooting() {
            System.out.println("Son Shooting");
        }
    }

    // Multiple inheritance i.e class Son extends Father, Mother is not supported
    // to avoid diamond problem


    // Abstract class has atleast one abstract method and one concrete method. Abstract method
    // needs to be implemented by the derived class. Abstract class cannot be instantiated
    public abstract class Bike {
        abstract void start();
        void applyBrake() {

        }
    }
    
    public class RoyalEnfield extends Bike {
        void start() {

        }
    }


    // Interface has only abstract methods, class implementing the interface has to
    // implement the abstract methods mandatorily. An interface cannot be instantiated as it is 
    // a mere place holder defining the top-level API contract
    public interface Printer {
        abstract void printing();
        abstract void loadPaper();
    }

    public class LaserPrinter implements Printer {
        public void printing() {

        }

        public void loadPaper() {
        }
    }
    
    // Generic types
    public class Box<T> {
        // T stands for "Type"
        private T t;

        public void set(T t) { this.t = t; }

        public T get() {
            return t;
        }
    }

    public static void main(String[] args) {
        a09Class outerObj = new a09Class();
        // Since 'Date' is nested inside 'a09_Class' we need to instantiate the outer class first
        Date currentDate = outerObj.new Date(22, 1, 2023);
        Date.printMonthlyCalendar(1, 2023);
        Date.printMonthlyCalendar(7, 2023);
        currentDate.printWeekday(); // This will print 'sunday'

        //Instantiating time class
        Time time = outerObj.new Time(currentDate, 18, 30, 0, "GMT+5:30");
        time.printTime();

        // Instantiating samsung class and upcasting it to mobilephone
        MobilePhones phone = outerObj.new Samsung(500);
        // Downcasting phone to Samsung. If 'phone' is not samsung then 'classCastingException' will be thrown
        // at the run time
        Samsung samsung = (Samsung) phone;

        // Instantiating Son class
        GrandFather sonObject = outerObj.new Son();
        sonObject.shooting(); // will call shooting function from 'Son' class

        // Instantiating box having number
        Box<Integer> boxWithInteger = outerObj.new Box<Integer>();
        boxWithInteger.get();
    }
}
