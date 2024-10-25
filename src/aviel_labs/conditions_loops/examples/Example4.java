package aviel_labs.conditions_loops.examples;

// Guess the letter game, 3rd version.
class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // get a char

        if(ch == answer) System.out.println("** Right **");
        else {
            System.out.print("...Sorry, you're ");

            // a nested if
            if(ch < answer) System.out.println("too low");
            else System.out.println("too high");
        }
    }
}

/*
Summary:
The program prompts the user to guess a letter between A and Z.

It reads the user's input and compares it to the answer, which is 'K'.

If the guess is correct, it prints "** Right **".

If the guess is incorrect, it prints "...Sorry, you're too low" if the guess is lower than 'K',
or "...Sorry, you're too high" if the guess is higher than 'K'.

 */
