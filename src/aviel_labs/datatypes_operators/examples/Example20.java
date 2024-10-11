package aviel_labs.datatypes_operators.examples;

// Using a cast.
class UseCast {
    public static void main(String args[]) {
        int i;

        for(i = 0; i < 5; i++) {
            System.out.println(i + " / 3: " + i / 3);
            System.out.println(i + " / 3 with fractions: "
                    + (double) i / 3);
            System.out.println();
        }
    }
}

/*
    output:
0 / 3: 0
0 / 3 with fractions: 0.0

1 / 3: 0
1 / 3 with fractions: 0.3333333333333333

2 / 3: 0
2 / 3 with fractions: 0.6666666666666666

3 / 3: 1
3 / 3 with fractions: 1.0

4 / 3: 1
4 / 3 with fractions: 1.3333333333333333

 */

/*
    Explanation:
        Class Declaration: The UseCast class contains the main method.
        Main Method: This is where the program execution starts.
        Variable Declaration:
            int i; declares an integer variable i.
        For Loop:
            for(i = 0; i < 5; i++) sets up a loop that runs five times (i from 0 to 4).
        Inside the loop:
            System.out.println(i + " / 3: " + i / 3); prints the integer result of i divided by 3.
                Since this is integer division, any fractional part is discarded.
            System.out.println(i + " / 3 with fractions: " + (double) i / 3);
                casts i to a double before division, ensuring the result includes fractional values.
            System.out.println(); prints an empty line for better readability.
        Output:
            The output of this code will be:
0 / 3: 0
0 / 3 with fractions: 0.0

1 / 3: 0
1 / 3 with fractions: 0.3333333333333333

2 / 3: 0
2 / 3 with fractions: 0.6666666666666666

3 / 3: 1
3 / 3 with fractions: 1.0

4 / 3: 1
4 / 3 with fractions: 1.3333333333333333

    Key Points:
        Integer Division:
            i / 3 performs integer division, discarding any remainder.
        Floating-Point Division:
            (double) i / 3 casts i to a double before division,
                producing a floating-point result that includes the fractional part.
    This code showcases how casting can change the results of arithmetic operations
        by ensuring different data types are used.
 */