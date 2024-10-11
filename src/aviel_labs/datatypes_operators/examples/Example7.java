package aviel_labs.datatypes_operators.examples;

// Demonstrate dynamic initialization.
class DynInit {
    public static void main(String args[]) {
        double radius = 4, height = 5;

        // dynamically initializ volume
        double volume = 3.1416 * radius * radius * height;

        System.out.println("Volume is " + volume);
    }
}

/*
Output:
Volume is 251.328

 */

/*
    class declaration
        DynInit class contains the main method
        Main method:
            variable declaration and initialization:
                double radius = 4, height = 5;
                initializes the radius and height of a cylinder with values 4 and 5, respectively.
            Dynamic Initialization:
                double volume = 3.1416 * radius * radius * height;
                calculates the volume of a cylinder using the formula for the volume of a cylinder:
                V = π*r^2*h
                Here, 3.1416 is an approximation of π (pi),
                radius is squared and then multiplied by the height to get the volume.
Key Points:
Dynamic Initialization: The volume is calculated at runtime using the values of radius and height.
Mathematical Formula: Utilizes the cylinder volume formula:
V = π*r^2*h

Output: Provides a clear output statement showing the calculated volume.

So, this code demonstrates how to dynamically calculate and print the volume of a cylinder given its radius and height.

 */