package aviel_labs.datatypes_operators.examples;

/*
   Use the Pythagorean theorem to find
   find the length of the hypotenuse
   given the lengths of the two opposing
   sides.
*/
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        // calls sqrt() method from Math class
        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " +z);
    }
}
/*
Class declaration:
    the Hypot class contains the main method
Main Method: where the program execution begins.
    Variable declaration
        double x, y, z;
        declares three double variables to store the lengths of the sides of a
        triangle (x and y) and the hypotenuse (z)
Initialization:
    x = 3; and y = 4;
    initialize the lengths of the two sides of a right triangle
Pathagorean Theorem:
    z = Math.sqrt(x * x + y * y);  uses the Pythagorean theorem formula
    c= sqrt(a^2 + b^2) to calculate the hypotenuse.
Output:
    System.out.println("Hypotenuse is " + z); prints the calculated length of the hypotenuse.

 */