package src.basics;

/*
what is an operator ?
Operator does some operation on operand(s)

What are the different types of operators?

1. Unary operator
    Increment ++
    Decrement -- 
    Tilde (bitwise not) ~

2. Binary operator

    a. Arithmetic operators(+, -, /, *, % )
    b. Bitwise operators (&, |, ^)
    c. Logical operators(&&, ||, !, =, ==, !=, >, < , >= , <=)

3. Ternary operator (?:)

*/

public class a05Operators {
    public static void main(String[] args) {

        // Increment operator
        int num = 100;
        ++num; // equivalent to num = num + 1; hence num = 101.

        // decrement operator
        --num; // equivalent to num = num -1; hence num = 100

        // Pre-Increment -> increment first & assign later
        num = 100;
        int anotherNum = ++num; // equivalent to num = num + 1; anotherNum = num
        System.out.println(anotherNum); // 101

        // Post-Increment -> assign first and increment later
        num = 100;
        int num2 = ++num; // equivalent to num2 = num; num = num + 1
        System.out.println(num2); // 100

        num = 100;
        int num3 = ~num; // Bitwise Not
        System.out.println(num3);

        System.out.format("On dividing %d by %d reminder is %d ", 100, 3, (100 % 3));

        // * Truth table (Bit-wise operators)
        // * A B & | ^
        // * 0 0 0 0 0
        // * 0 1 0 1 1
        // * 1 0 0 1 1
        // * 1 1 1 1 0
        // *
        // *
        // *
        // * 6 & 7 -> (110)base2 -> (6)base10
        // * 6 | 7 -> (111)base2 -> (7)base10
        // * 6 ^ 7 -> (001)base2 -> (1)base10

        System.out.format(" 6 & 7 = ", (6 & 7));
        System.out.format("6 | 7 =", (6 | 7));
        System.out.format("6 ^ 7 =", 6 ^ 7);

    }
}