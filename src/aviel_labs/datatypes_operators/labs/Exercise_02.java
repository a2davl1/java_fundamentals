package aviel_labs.datatypes_operators.labs;

/**
 * Data Types and Operators Exercise 2: Type conversion and casting
 *
 *      Write the necessary code to demonstrate type conversion:
 *
 *      Widening:
 *      1. Declare and initialize an int with the value 10
 *      2. Declare a double and set it equal to the int
 *      3. Print out the double
 *
 *      Narrowing (with casting):
 *      1. Declare and initialize a new double with the value 10.5
 *      2. Declare a new int and set it equal to the double (make sure to cast the double to an int)
 *      3. Print out the int
 *
 *      Notice how each type is converted. In which direction is information lost?
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // write code here
        // Widening conversion
        // Step 1: Declare and initialize an int with the value 10
        int myInt = 10;

        // Step 2: Declare a double and set it equal to the int
        double myDouble = myInt;

        // Step 3: Print out the double
        System.out.println("Double (widening conversion): " + myDouble);

        // Narrowing conversion (with casting)
        // Step 1: Declare and initialize a new double with the value 10.5
        double anotherDouble = 10.5;

        // Step 2: Declare a new int and set it equal to the double (with casting)
        int anotherInt = (int) anotherDouble;

        // Step 3: Print out the int
        System.out.println("Int (narrowing conversion): " + anotherInt);

        // Notice how each type is converted. In which direction is information lost?
        System.out.println("Information is lost during narrowing conversion (double to int) because the fractional part is truncated.");

    }
}
