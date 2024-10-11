package aviel_labs.datatypes_operators.examples;

// Demonstrate the % operator.
class ModDemo {
    public static void main(String args[]) {
        int iresult, irem;
        double dresult, drem;

        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("Result and remainder of 10 / 3: " +
                iresult + " " + irem);
        System.out.println("Result and remainder of 10.0 / 3.0: " +
                dresult + " " + drem);

    }
}

/*
Output
Result and remainder of 10 / 3: 3 1
Result and remainder of 10.0 / 3.0: 3.3333333333333335 1.0
 */

/*
    Class Declaration: The ModDemo class contains the main method.
    Main Method: This is where the program execution starts.
        Variable Declaration:
            int iresult, irem; declares two integer variables to store the integer division result and remainder.
            double dresult, drem; declares two double variables to store the floating-point division result and remainder.
        Integer Division:
            iresult = 10 / 3; performs integer division. The result is 3, because integer division discards the fractional part.
            irem = 10 % 3; calculates the remainder of the integer division. The result is 1.
        Floating-Point Division:
            dresult = 10.0 / 3.0; performs floating-point division. The result is approximately 3.3333.
            drem = 10.0 % 3.0; calculates the remainder of the floating-point division. The result is 1.0.
        Output:
        System.out.println("Result and remainder of 10 / 3: " + iresult + " " + irem);
            prints the results of the integer division and remainder.
        System.out.println("Result and remainder of 10.0 / 3.0: " + dresult + " " + drem);
            prints the results of the floating-point division and remainder.

    Key Points:
        Integer Division:
            The result of 10 / 3 is 3 (integer division).
            The remainder of 10 % 3 is 1.
        Floating-Point Division:
            The result of 10.0 / 3.0 is approximately 3.3333.
            The remainder of 10.0 % 3.0 is 1.0.

    This code showcases the difference between integer and floating-point division in Java
 */