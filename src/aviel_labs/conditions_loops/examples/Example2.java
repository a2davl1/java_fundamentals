package aviel_labs.conditions_loops.examples;

// Guess the letter game.
class Guess {
    public static void main(String args[])
            throws java.io.IOException {

        char ch, answer = 'K';

        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it: ");

        ch = (char) System.in.read(); // read a char from the keyboard

        if(ch == answer) System.out.println("** Right **");
    }
}

/*
Summary:
The program prompts the user to guess a letter between A and Z.

It reads the user's input and compares it to the answer, which is 'K'.

If the guess is correct, it prints "** Right **"; otherwise, nothing happens.

Simple and effective for a basic guessing game.
 */