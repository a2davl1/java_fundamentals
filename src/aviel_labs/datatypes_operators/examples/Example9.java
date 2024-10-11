package aviel_labs.datatypes_operators.examples;

// Demonstrate lifetime of a variable.
class VarInitDemo {
    public static void main(String args[]) {
        int x;

        for(x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
/*

    Output:

y is: -1
y is now: 100
y is: -1
y is now: 100
y is: -1
y is now: 100

 */
/*
    Class declaration
        The VarInit class contains the main method.
    Main Method:
        Variable declaration:
            int x; declares an integer variable x that is accessible throughout the main method.
        For Loop:
            for(x = 0; x < 3; x++)
            starts a loop that runs three times (x values from 0 to 2).
        Block Inside the Loop:
            int y = -1; initializes the variable y with the value -1 every time the block is entered.
            Systemm.out.println("y is: " + y);
                prints the current value of y, which is -1.
            y = 100; sets the value of y to 100.
                System.out.println("y is now: " + y); prints the updated value of y, which is 100
    Key Points:
        x is declared outside the accessible throughout the loop.
        y is declared inside the loop block and is reinitialized to -1 every time the block is entered.
    Loop Behavior:
        The loop runs three times. Each time, y is set to -1, printed, then set to 100, and printed again.

 */