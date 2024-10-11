package aviel_labs.datatypes_operators.examples;

// Side-effects can be important.
class SideEffects {
    public static void main(String args[]) {
        int i;

        i = 0;

    /* Here, i is still incremented even though
       the if statement fails. */
        if(false & (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statements executed: " + i); // displays 1

    /* In this case, i is not incremented because
       the short-circuit operator skips the increment. */
        if(false && (++i < 100))
            System.out.println("this won't be displayed");
        System.out.println("if statements executed: " + i); // still 1 !!
    }
}

/*
    Output:
        if statements executed: 1
        if statements executed: 1
 */

/*
    Explanation:
        Class Declaration: The SideEffects class contains the main method.
        Main Method: This is where the program execution starts.
        Variable Declaration and Initialization:
            int i; declares an integer variable i.
            i = 0; initializes i to 0.
        First if Statement (Non-Short-Circuit AND &):
            if(false & (++i < 100)) uses the non-short-circuit AND operator &.
            Even though false & (something) is always false, the & operator evaluates both sides.
            ++i increments i before the comparison, so i becomes 1.
            The if condition is false, so "this won't be displayed" is not printed.
            System.out.println("if statements executed: " + i); prints the value of i, which is now 1.
        Second if Statement (Short-Circuit AND &&):
            if(false && (++i < 100)) uses the short-circuit AND operator &&.
            With &&, if the first condition is false, the second condition is not evaluated.
            Since false is the first condition, ++i is not executed, so i remains 1.
            The if condition is false, so "this won't be displayed" is not printed.
            System.out.println("if statements executed: " + i); prints the value of i, which is still 1.
    Key Points:
        Non-Short-Circuit AND &:
            Evaluates both operands even if the first one is false,
                causing side effects like incrementing i.
        Short-Circuit AND &&:
            Stops evaluating as soon as the first condition is false,
                avoiding unnecessary operations and potential side effects.
    This code effectively demonstrates the difference between the short-circuit && operator
        and the non-short-circuit & operator.
 */