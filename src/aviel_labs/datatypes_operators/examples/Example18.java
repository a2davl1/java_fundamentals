package aviel_labs.datatypes_operators.examples;

/*

   Print a truth table for the logical operators.
*/
class LogicalOpTable {
    public static void main(String args[]) {

        boolean p, q;

        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = true; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = true;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));

        p = false; q = false;
        System.out.print(p + "\t" + q +"\t");
        System.out.print((p&q) + "\t" + (p|q) + "\t");
        System.out.println((p^q) + "\t" + (!p));
    }
}

/*
   Output:
        P       Q       AND     OR      XOR     NOT
        true    true    true    true    false   false
        true    false   false   true    true    false
        false   true    false   true    true    true
        false   false   false   false   false   true
 */

/*
    Explanation:
        Class Declaration: The LogicalOpTable class contains the main method.
        Main Method: This is where the program execution begins.
        Variable Declaration:
            boolean p, q; declares two boolean variables p and q.
        Header Printing:
            System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT"); prints the header for the logical operation table.
        First Row (p = true, q = true):
            p = true; q = true;
            System.out.print(p + "\t" + q + "\t"); prints the values of p and q.
            System.out.print((p & q) + "\t" + (p | q) + "\t"); prints the results of p AND q and p OR q.
            System.out.println((p ^ q) + "\t" + (!p)); prints the results of p XOR q and NOT p.
        Second Row (p = true, q = false):
            p = true; q = false;
            Similar steps as above, printing the logical operations' results for this combination.
        Third Row (p = false, q = true):
            p = false; q = true;
            Again, prints the logical operations' results for this combination.
        Fourth Row (p = false, q = false):
            p = false; q = false;
            Prints the logical operations' results for this combination.
        Logical Operators:
            AND (&): true if both operands are true.
            OR (|): true if at least one operand is true.
            XOR (^): true if exactly one operand is true.
            NOT (!): true if the operand is false.
O
utput:
        The output of this code will be:
P       Q       AND     OR      XOR     NOT
true    true    true    true    false   false
true    false   false   true    true    false
false   true    false   true    true    true
false   false   false   false   false   true

This code creates a truth table for the logical operations AND, OR, XOR, and NOT.
 */