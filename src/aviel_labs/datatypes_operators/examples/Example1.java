package aviel_labs.datatypes_operators.examples;

/*
   Compute the number of cubic inches
   in 1 cubic mile.
*/
class Inches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci +
                " cubic inches in cubic mile.");

    }
}

/*
Output
There are 254358061056000 cubic inches in cubic mile.

 */

/*
   Notes
Class Declaration: Inches class contains the main method
Main Method: This is where the program starts executing.
Variable Declaration:
    long ci; stores the number of cubic inches
    long im; delcares a variable im to store the number of inches in a mile
Conversion calculation:
    im = 5280 * 12; converts miles to inches
    this line calculates the total inches in 1 mile
Cubic inches calculation:
    ci = im * * im * im;
    calculates the total number of cubic inches in a cubic mile
    by cubing the number of inches in a mile
Output:
    System.out.println("There are " + ci + " cubic inches in a cubic mile.");
       prints the result,
       displaying how many cubic inches are in one cubic mile.

 */