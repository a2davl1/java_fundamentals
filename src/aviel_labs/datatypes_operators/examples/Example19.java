package aviel_labs.datatypes_operators.examples;

// A promotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no cast needed

        b = 10;
        b = (byte) (b * b); // cast needed!!

        System.out.println("i and b: " + i + " " + b);
    }
}

/*
    output:
    i and b: 100 100
 */

/*
    Explanation:
        Class Declaration: The PromDemo class contains the main method.
        Main Method: This is where the program execution starts.
        Variable Declaration:
            byte b; declares a variable b of type byte.
            int i; declares a variable i of type int.
        Variable Initialization and Operations:
            b = 10; initializes b with the value 10.
            i = b * b; multiplies b by itself (10 * 10 = 100) and stores the result in i.
                This is fine because int can hold the result of this operation without requiring a cast.
            b = 10; reinitializes b to 10.
            b = (byte) (b * b); multiplies b by itself again.
                This time, it requires a cast to byte because the result of b * b is int by default,
                    which must be explicitly cast back to byte to fit into b.
                    The cast is necessary to avoid a type mismatch error.
        Output:
            System.out.println("i and b: " + i + " " + b); prints the values of i and b. i will be 100, and b will also be 100 because of the cast.
    Key Points:
        Type Promotion and Casting:
            In arithmetic operations, byte operands are promoted to int before the operation. Hence, b * b results in an int.
            To store the result back in a byte variable, a cast is required: (byte) (b * b).
        Variable Reuse:
            b is reused and reinitialized, ensuring the operations are independent.
        This code showcases type promotion and the need for explicit casting in Java. Handy for avoiding those pesky type mismatch errors
 */