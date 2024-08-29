package aviel_labs.fundamentals.exercise04;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below
        byte b = 127;
        short s = 30000;
        long l = 1234567890123L;
        float f = 3.14f;
        double d = 2.71828;
        char c = 'A';
        boolean bool = true;

        // Printing the other variables
        System.out.println("byte b is: " + b);
        System.out.println("short s is: " + s);
        System.out.println("long l is: " + l);
        System.out.println("float f is: " + f);
        System.out.println("double d is: " + d);
        System.out.println("char c is: " + c);
        System.out.println("boolean bool is: " + bool);
    }

}
