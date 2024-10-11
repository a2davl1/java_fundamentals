package aviel_labs.datatypes_operators.examples;

// Demonstrate boolean values.
class BoolDemo {
    public static void main(String args[]) {
        boolean b;

        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);

        // a boolean value can control the if statement
        if(b) System.out.println("This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        // outcome of a relational operator is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}

/*

Output:
b is false
b is true
This is executed.
10 > 9 is true

 */

/*
    Class Declaration:
        The BoolDemo class contains the main method.
    Main Method: This is where the program execution begins.
        Variable Declaration:
            boolean b; declares a boolean variable b.
        Variable Initialization:
            b = false; assigns the value false to b.
            System.out.println("b is " + b); prints "b is false".
            b = true; assigns the value true to b.
            System.out.println("b is " + b); prints "b is true".
        Boolean Control in if Statement:
            if(b) System.out.println("This is executed.");
                Since b is true, this statement prints "This is executed."
            b = false; assigns the value false to b.
            if(b) System.out.println("This is not executed.");
                Since b is now false, this statement is not executed.
        Relational Operator:
            System.out.println("10 > 9 is " + (10 > 9));
                The expression (10 > 9) evaluates to true, so this statement prints "10 > 9 is true".
Key Points:
Boolean Variables: The boolean data type can hold one of two values: true or false.

Control Statements: Boolean values can control the flow of if statements.

Relational Operators: The result of a relational operation (e.g., 10 > 9) is a boolean value.

 */