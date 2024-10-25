package aviel_labs.conditions_loops.examples;

// Parts of the for can be empty.
class Empty {
    public static void main(String args[]) {
        int i;

        for(i = 0; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}

/*
Class Declaration:
    Empty
Main Method:
    public static void main(String args[]) {
Variable Declaration Line:
    int i;
Variable:
    i
Variable Type:
    int
For Loop Line:
    for(i = 0; i < 10; ) {
For Loop Initialization:
    i = 0
        Explanation: starts the loop with i initialized to 0
For Loop Condition:
    i < 10
        Explanation: continues the loop as long as i < 10
For Loop Update:
    loop is empty,
        Explanation:
    instead the increment happens inside the loop body
Print Statement:
    System.out.println("Pass #" + i);
    i++;
        Explanation: prints the current iteration number as "Pass #i".
        Increments i by 1.
Execution:
    The loop stats with 1 at 0
    It prints "Pass #0" and increments i to 1.
    This continues until i reaches 9
Output:
Pass #0
Pass #1
Pass #2
Pass #3
Pass #4
Pass #5
Pass #6
Pass #7
Pass #8
Pass #9

Summary:
The loop runs from 0 to 9,
printing the current pass number and incrementing i inside the loop body.

The key thing to notice here is that the increment operation is inside the loop block rather than in the loop header.
 */