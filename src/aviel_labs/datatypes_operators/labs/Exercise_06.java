package aviel_labs.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        // Define constants for the radius and height of the cylinder
        double radius = 3.14;
        double height = 5.0;

        // Calculate the volume of the cylinder: V = πr^2h
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // Calculate the surface area of the cylinder: A = 2πrh + 2πr^2
        double surfaceArea = 2 * Math.PI * radius * height + 2 * Math.PI * Math.pow(radius, 2);

        // Print out the results
        System.out.println("Volume of the cylinder: " + volume);
        System.out.println("Surface area of the cylinder: " + surfaceArea);
    }
}
