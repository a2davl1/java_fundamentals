package aviel_labs.datatypes_operators.examples;

// Demonstrate casting.
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for X
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}

/*
    Output:
        Integer outcome of x / y: 3
        Value of b: 100
        Value of b: 1
        ch: X
 */

/*
    Explanation:
        Class Declaration: The CastDemo class contains the main method.
        Main Method: This is where the program execution starts.
        Variable Declaration:
            double x, y; declares two double variables x and y.
            byte b; declares a byte variable b.
            int i; declares an integer variable i.
            char ch; declares a character variable ch.
        Variable Initialization:
            x = 10.0; and y = 3.0; initialize x and y with floating-point values.
        Casting from Double to Int:
            i = (int) (x / y); divides x by y, resulting in 3.3333, and then casts the result to an integer, which truncates the decimal part, resulting in 3.
            System.out.println("Integer outcome of x / y: " + i); prints the integer result of the division, which is 3.
        Casting from Int to Byte:
            i = 100; assigns the value 100 to i.
            b = (byte) i; casts the integer value to a byte. Since 100 is within the byte range (-128 to 127), b remains 100.
            System.out.println("Value of b: " + b); prints the value of b, which is 100.
            i = 257; assigns the value 257 to i.
            b = (byte) i; casts the integer value to a byte. Since 257 exceeds the byte range, it wraps around and results in 1 (calculated as 257 % 256).
            System.out.println("Value of b: " + b); prints the value of b, which is 1.
        Casting from Byte to Char:
            b = 88; assigns the value 88 to b.
            ch = (char) b; casts the byte value to a character, which corresponds to the ASCII code for X.
            System.out.println("ch: " + ch); prints the character ch, which is X.
    Key Points:
        Casting: Explicitly converting one data type to another using parentheses.
            (int) (x / y) converts the double result to an integer.
            (byte) i converts the integer value to a byte.
            (char) b converts the byte value to a character.
        Wrapping Around in Bytes: Byte values exceeding the range (-128 to 127) will wrap around.
    This code demonstrates various type conversions and their effects in Java.
 */