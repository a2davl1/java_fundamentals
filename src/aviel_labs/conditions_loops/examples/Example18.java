package aviel_labs.conditions_loops.examples;

// The body of a loop can be empty.
class Empty3 {
    public static void main(String args[]) {
        int i;
        int sum = 0;

        // sum the numbers through 5
        for(i = 1; i <= 10000; sum += i++) ;

        System.out.println("Sum is " + sum);
    }
}

/*

Class Declaration: class Empty3 {
Main Method: public static void main(String args[] {
Variable Declaration Line: int 1; int sum = 0;
    Variable: Declares an integer variable i.
    Initializes sum to 0. This variable will store the cumulative sum of numbers from 1 to 10,000.
For Loop Line: for(i = 1; i <= 10000; sum += i++) ;
    For Loop Initialization:i = 1
        Explanation: Starts the loop with i initialized to 1.
    For Loop Condition: i <= 10000
        Explanation: Continues the loop as long as i is less than or equal to 10,000.
    For Loop Update: sum += i++
        Explanation: Adds the current value of i to sum, then increments i.
Print Statement: System.out.println("Sum is " +
        Explanation: prints the calculated sum of numbers from 1 to 10,000.
Execution:

Output:
Summary:
The loop calculates the sum of all integers from 1 to 10,000 using the update statement sum += i++.

The for loop does not have a body; all actions occur in the loop header.

The final sum is printed out after the loop ends.

By the end of the loop, the value of sum will be the sum of numbers from 1 to 10,000, which is 50,005,000.
*/