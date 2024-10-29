package aviel_labs.conditions_loops.examples;

// Demonstrate the while loop.
class WhileDemo {
    public static void main(String args[]) {
        char ch;

        // print the alphabet using a while loop
        ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch);
            ch++;
        }
    }
}

/*
This demonstrates the use of a while loop
    to print the alphabet

Class Declaration:
    class WhileDemo {
Main Method:
    public static void man(String args[]) {
Variable Declaration Line: char ch;
    Variable: ch
    Variable Type: char
Initialize Character: ch = 'a';
    initializes the variable ch to the character 'a'.
While Loop: while (ch <= 'z')
    creates a loop that will run as long as ch is less than or equal to the character 'z'.
Print Character: System.out.print(ch);
Increment Character: ch++;
    increments the value of ch to the next character in the Unicode sequence.

    This loop starts with the character 'a'
    and continues printing each character until it reaches 'z'.
    Simple yet effective way to print the alphabet in lowercase!

*/