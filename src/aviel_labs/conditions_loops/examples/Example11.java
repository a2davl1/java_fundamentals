package aviel_labs.conditions_loops.examples;

// Show square roots of 1 to 99 and the rounding error.
class SqrRoot {
    public static void main(String args[]) {
        double num, sroot, rerr;

        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num +
                    " is " + sroot);

            // compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}
/*
Summary:
The program displays a simple help menu for if and switch statements.

It reads the user's input and provides the corresponding help text based on the choice.

If the user enters an invalid choice, it prints "Selection not found."


 */