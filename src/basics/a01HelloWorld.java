package src.basics;

/*
JVM = JIT Compiler + Java Interpreter + Garbage Collector
JRE = JVM + Library Classes
JDK = JRE + Development Tool

*/
// class name should match the filename
public class a01HelloWorld {

    // single line comment in Java starts with double forward slashes,
    // Comments are a statements which will not be interpetted by java compiler

    /*
     * This is a multi-line comment
     * We can use it to add long comment. Functionally they serve the same
     * purpose as single-line comment
     */

    // main the entry point to the application
    public static void main(String[] args) {
        // To print a message on the console
        System.out.print("Hello World program"); // Every statement terminated with semi-colon to indicate end of
                                                 // statement
        System.out.println("Hi");
    }
}

/*
 * javac i.e. Java complier is a component inside JVM
 * which converts code into byte code
 *
 * javap (aka java disassembler) just does the opposite of javac, it takes a
 * class file and produces code
 */