package aviel_labs.datatypes_operators.examples;

// *** This program will not compile. ***
class LtoD_2 {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        //L = D; // Illegal!!!

        //System.out.println("L and D: " + L + " " + D);

    }
}

/*
Output:
WONT EXECUTE
 */

/*
    Explanation:
        Class Declaration: The LtoD_2 class contains the main method.
        Main Method: This is where the program execution starts.
        Variable Declaration:
            long L; declares a variable L of type long (a 64-bit integer).
            double D; declares a variable D of type double (a 64-bit floating-point number).
        Variable Initialization:
            D = 100123285.0; assigns the floating-point value 100123285.0 to D.
        Commented-Out Code:
            // L = D; // Illegal!!!
                is commented out and indicates that assigning a double value
                    to a long variable is illegal in Java.
                This is because it would result in a narrowing conversion,
                    which can potentially lead to loss of data.
            // System.out.println("L and D: " + L + " " + D);
                is also commented out, so it won't execute.
    Key Points:
        Type Conversion:
            Converting a double to a long is not allowed without an explicit cast
                because it is a narrowing conversion (from a wider data type to a narrower data type),
                which may result in loss of precision.
            You can convert double to long using an explicit cast like this:
                L = (long) D; but beware of possible data loss.
        Commented-Out Code:
            The // indicates comments in Java, which means the code following // won't be executed.
    The key takeaway is to be cautious with type conversions and aware of potential precision loss.
 */