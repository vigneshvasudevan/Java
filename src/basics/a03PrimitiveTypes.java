package src.basics;

/*
Primitive aka basic data types supported in java 8
can be broadly categorized as below

1. Intgers -> whole numbers, -ve and +ve, Default value = 0
    a. byte -> 8 bit
    b. short -> 16bit
    c. int -> 32 bit
    d. long -> 64 bit
    Note: Uses 2's compliment to store -ve numbers
2. Floating point
    a. Float -> 32bit floating point, Default value = 0.0f 
    b. Double -> 64bit floating point, Default value = 0.0
3. Characters -> Supports unicode i.e. non english characters,
    takes up 16bit, Default value = null
4. Boolean -> holds up 'yes' or 'no' kinda of information,
    Default value = false
*/

public class a03PrimitiveTypes {
    // creating variables of primitive types
    public static void main(String[] args) {
        byte tinyNumber = (byte) 45;
        System.out.println(tinyNumber);
        short smallerNum = (short) 1000;
        System.out.println(smallerNum);
        int number = 257;
        System.out.println(number);
        long bigNumber = 12345678;
        System.out.println(bigNumber);

        float decimalNumWithLessPrecision = 8.12345678912876989875873687f;
        System.out.format("decimalNumWithLessPrecision = %f", decimalNumWithLessPrecision);
        double decimalNumWithMorePrecision = 8.12345678912876989875873687f;
        System.out.format("decimalNumWithMorePrecision = %f", decimalNumWithMorePrecision);

        char myInitials = 'A';
        System.out.format("My intial is %c", myInitials);
        Boolean amIBoredNow = false;
        System.out.format("Am i bored now = %b", amIBoredNow);

    }
}
