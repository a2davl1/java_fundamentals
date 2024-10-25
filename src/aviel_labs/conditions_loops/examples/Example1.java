package aviel_labs.conditions_loops.examples;

// Read a character from the keyboard.
class KbIn {
    public static void main(String args[])
            throws java.io.IOException {

        char ch;

        System.out.print("Press a key followed by ENTER: ");

        ch = (char) System.in.read(); // get a char

        System.out.println("Your key is: " + ch);
    }
}

/*

    Summary:
        The program prompts the user to press a key and then press Enter.
        It reads the first character input by the user and prints it back to the console.

 */