package src.basics;

/*
What is a variable ?
Variable holds the data in-memory(RAM)

Why we need a variable ?
To store data and later use it atleast once

How to use work with a variable ?
Creating variable:
    syntax: <type> <variablename> = <value>;

    e.g) int age = 18;

Java is a strictly typed language, meaning we could
only assign integer value to a integer variable. On assigning
say character to integer it would be casted as required to fit.



*/

public class a02Variables {
    static int var1 = 10;

    public static void main(String[] args) {
        // declaring a local variable without initalizing explicitly
        int var2; // default value of 'int' i.e 0 will be assigned to var2
        System.out.format("var2 = %d%n", var2);
        // declaring and initializing variable
        int var3 = 20;
        System.out.format("var3 = %d%n", var3);
        // assigning var3 to a new value
        var3 = 30;
        {
            int var4 = 40;
            System.out.format("var4 = %d%n", var4);
        }
        // var4 won't be seen outside the block
    }
}
