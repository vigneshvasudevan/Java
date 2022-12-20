package src.basics;

/*
Whenever we assign a thing to another thing, the source
will be converted if required to the targer type. This is 
often referred as type casting

e.g) int x = 65;
     char c = x; 

    Here 'x' being a int will take 32 bit but character 'c'
    is 16bit, hence assinging 'x' to 'c' is likely to cause
    truncation(loss of data)

Casting can be lossless or lossy depending on the source
and target types. Usually when we source type is bigger than target type
it is likely (not always) to cause some loss of data aka truncation
*/

public class a04TypeCasting {
    public static void main(String[] args) {
        byte b = 100;
        int x = 260;
        b = (byte) x;
        System.out.println(b); // 4
        /*
         * Reason why output is 4
         * byte is 8 bit
         * 2^8 -1 = 256- 1= 255
         * 255+5 -> ??
         * 255+1 = 0
         * 0 + 1 = 1
         * 1 + 1 = 2
         * 2 + 1 = 3
         * 3 + 1 = 4
         */

        int num = 65;
        char alphabet = (char) num;
        System.out.format("alphabet is %c", alphabet);

        char alphabet2 = 'z';
        int var = alphabet2;
        System.out.format("ASCII equivalent of c = %d", var);

    }
}
