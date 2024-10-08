package aviel_labs.datatypes_operators.examples;

// Demonstrate escape sequences in strings.
class StrDemo {
    public static void main(String args[]) {
        System.out.println("First line\nSecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF");
    }
}

/*

Class declaration
    StrDemo class contains the main method
    Main Method
        First Print Statement
        System.out.println("First line\nSecond line");
            Result:
                First line
                Second line
        second print statement
        System.out.println("A\tB\tC");
            Output: "A", "B", and "C" are separated by tabs because of the \t (tab) character.
            Result:
                A    B    C
        Third Print Statement
        System.out.println("D\tE\tF");
           Output: "D", "E", and "F" are separated by tabs.
           Results:
                D    E    F

Key Points:
Escape Sequences: The \n and \t are escape sequences in Java.
\n inserts a newline.
\t inserts a tab space.
System.out.println(): This method is used to print text to the console.




 */