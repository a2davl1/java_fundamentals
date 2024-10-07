package aviel_labs.datatypes_operators.examples;

// Character variables can be handled like integers.
class CharArithDemo {
    public static void main(String args[]) {
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; // increment ch
        System.out.println("ch is now " + ch);

        ch = 90; // give ch the value Z
        System.out.println("ch is now " + ch);
    }
}
/*
    Main method
        variable declaration:
            char ch
        Initialization:
            ch = 'X'; assigns the character 'X' to ch.
            prints "ch contains X"
        Increment operation:
            ch++ increments the character X to next character Y
            prints "ch is now Y"
        Direct assignment:
            ch = 90; assigns the UNICODE value 90 to ch, which CORRESPONDS to the character 'Z'
            prints "ch is now Z"

 */