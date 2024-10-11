package aviel_labs.datatypes_operators.examples;

// Demonstrate block scope.
class ScopeDemo {
    public static void main(String[] args) {
        int x; // known to all code within main

        x = 10;
        if(x == 10) { // start new scope
            int y = 20; // known only to this block

            // x and y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Error! y not known here

        // x is still known here.
        System.out.println("x is " + x);
    }
}

/*

Output:
x and y: 10 20
x is 40

 */
/*
    Class Declaration: The ScopeDemo class contains the main method.
    Main Method: This is where the program execution starts.
        Variable Declaration:
            int x; declares an integer variable x that is known throughout the main method.
        Variable Initialization:
            x = 10; assigns the value 10 to x.
        New Scope:
            if(x == 10) creates a new scope/block.
            int y = 20; declares an integer variable y that is only known within this block.
        Inside the Block:
            Both x and y are accessible.
            System.out.println("x and y: " + x + " " + y); prints the values of x and y, resulting in "x and y: 10 20".
            x = y * 2; updates x to be twice the value of y (i.e., x = 40).
        Outside the Block:
            // y = 100; // Error! y not known here would cause an error if uncommented because y is not accessible outside the if block.
            System.out.println("x is " + x); prints the updated value of x, resulting in "x is 40".

Key Points:
Variable Scope:
    x is declared and accessible throughout the main method.
    y is declared within the if block and is only accessible within that block.
Scope Demonstration:
    The code demonstrates how variable scope works in Java,
        showing that variables declared within a block are not accessible outside of it.

 */