package aviel_labs.datatypes_operators.examples;

// Demonstate automatic conversion from long to double.
class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);

    }
}

/*
    Output:
        L and D: 100123285 1.00123285E8
 */

/*
    Explanation:
        Class Declaration: The LtoD class contains the main method.
        Main Method: This is where the program execution starts.
        Variable Declaration:
            long L; declares a variable L of type long (a 64-bit integer).
            double D; declares a variable D of type double (a 64-bit floating-point number).
        Variable Initialization:
            L = 100123285L; assigns the value 100123285 to the variable L.
                The L suffix indicates that this is a long literal.
            D = L; assigns the value of L to D.
                This demonstrates implicit type conversion (widening conversion)
                    where a long is converted to a double.
        Output:
            System.out.println("L and D: " + L + " " + D);
                prints the values of L and D.
                The output will show L as an integer and D as a floating-point number.
    Key Points:
        Type Conversion: This code shows an implicit type conversion
            (also known as widening conversion) from long to double.
                In Java, this is allowed because there is no loss of precision in the process.
        Output: The values of both variables are printed,
            demonstrating that D correctly holds the floating-point representation of L.
    The value of L remains an integer, while D is displayed with a decimal point,
        showing it as a floating-point number.
 */