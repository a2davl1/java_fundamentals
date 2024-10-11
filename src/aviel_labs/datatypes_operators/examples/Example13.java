package aviel_labs.datatypes_operators.examples;

// Demonstrate the short-circuit operators.
class SCops {
    public static void main(String args[]) {
        int n, d, q;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

        d = 0; // now, set d to zero

        // Since d is zero, the second operand is not evaluated.
        if(d != 0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);

    /* Now, try same thing without short-circuit operator.
       This will cause a divide-by-zero error.
    */
        if(d != 0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
    }
}

/*

Output:
2 is a factor of 10
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at aviel_labs.datatypes_operators.examples.SCops.main(Example13.java:22)
 */

/*
    Explanation:
        Class Declaration: The SCops class contains the main method.
        Main Method: The program execution starts here.
        Variable Declaration:
            int n, d, q; declares three integer variables n, d, and q.
        Initial Variable Assignment:
            n = 10; assigns 10 to n.
            d = 2; assigns 2 to d.
        First if Statement:
            if(d != 0 && (n % d) == 0) uses the logical AND operator && (short-circuit operator).
                It checks if d is not zero and if n is divisible by d.
            Since d is 2 (non-zero) and 10 % 2 == 0, it prints "2 is a factor of 10".
        Change d to Zero:
            d = 0; sets d to zero.
        Second if Statement (Short-Circuit Operator):
            If(d != 0 && (n % d) == 0) again checks if d is not zero and if n is divisible by d.
            Since d is zero, the first part of the && evaluates to false,
                and the second part (n % d) is not evaluated, avoiding a divide-by-zero error.
        Third if Statement (Without Short-Circuit Operator):
            if(d != 0 & (n % d) == 0) uses the single & operator, which does not short-circuit.
            Even though d is zero, both conditions are evaluated.
                This will cause a divide-by-zero error when evaluating (n % d).
            This demonstrates the difference between &&
                (which stops evaluation if the first condition is false)
                and & (which evaluates both conditions regardless).
    Key Points:
        Short-Circuit Operator &&:
            Stops evaluating as soon as one condition is false,
            preventing errors like divide-by-zero.
        Logical AND Operator &:
            Evaluates all conditions even if one is false,
            which can lead to runtime errors.
        Error Avoidance:
            Using short-circuit operators can prevent unnecessary
                calculations and potential runtime errors.
    This code is a great example of how different logical operators
        can impact the flow of your program and the importance of understanding their behavior
 */