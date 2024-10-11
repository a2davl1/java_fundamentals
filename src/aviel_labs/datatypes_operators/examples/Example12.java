package aviel_labs.datatypes_operators.examples;

// Demonstrate the relational and logical operators.
class RelLogOps {
    public static void main(String args[]) {
        int i, j;
        boolean b1, b2;

        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("this won't execute");
        if(i >= j) System.out.println("this won't execute");
        if(i > j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;
        if(b1 & b2) System.out.println("this won't execute");
        if(!(b1 & b2)) System.out.println("!(b1 & b2) is true");
        if(b1 | b2) System.out.println("b1 | b2 is true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 is true");
    }
}

/*

Output:
i < j
i <= j
i != j
!(b1 & b2) is true
b1 | b2 is true
b1 ^ b2 is true

 */

/*
    Class Declaration: The RelLogOps class contains the main method.
    Main Method: This is where the program execution begins.
        Variable Declaration:
            int i, j; declares two integer variables i and j.
            boolean b1, b2; declares two boolean variables b1 and b2.
        Integer Comparison:
            i = 10; assigns 10 to i.
            j = 11; assigns 11 to j.
            if(i < j) System.out.println("i < j");
                checks if i is less than j and prints "i < j" if true.
            if(i <= j) System.out.println("i <= j");
                checks if i is less than or equal to j and prints "i <= j" if true.
            if(i != j) System.out.println("i != j");
                checks if i is not equal to j and prints "i != j" if true.
            if(i == j) System.out.println("this won't execute");
                checks if i is equal to j (it won't execute because i is not equal to j).
            if(i >= j) System.out.println("this won't execute");
                checks if i is greater than or equal to j (it won't execute).
            if(i > j) System.out.println("this won't execute");
                checks if i is greater than j (it won't execute).

        Boolean Logic Operations:
            b1 = true; assigns true to b1.
            b2 = false; assigns false to b2.
            if(b1 & b2) System.out.println("this won't execute"); performs a logical AND operation.
                It won't execute because b1 and b2 are not both true.
            if(!(b1 & b2)) System.out.println("!(b1 & b2) is true"); uses the NOT operator to invert the result.
                It will print "!(b1 & b2) is true".
            if(b1 | b2) System.out.println("b1 | b2 is true"); performs a logical OR operation.
                It will print "b1 | b2 is true" because b1 is true.
            if(b1 ^ b2) System.out.println("b1 ^ b2 is true"); performs a logical XOR (exclusive OR) operation.
                It will print "b1 ^ b2 is true" because b1 and b2 are different.

        Key Points:
        Relational Operators: Used to compare integer values (<, <=, !=, ==, >=, >).
        Logical Operators: Used to perform boolean logic operations (&, |, ^, !).

        This code demonstrates how relational and logical operators can be used to make decisions in Java
 */