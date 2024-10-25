package aviel_labs.conditions_loops.examples;

// Move more out of the for loop.
class Empty2 {
    public static void main(String args[]) {
        int i;

        i = 0; // move initialization out of loop
        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}

/*

Class Declaration: Empty2
Main Method:
    public static void main(String args[]) {
Variable Declaration Line:
    int i;
    i = 0;
Variable:
    i
Variable Type:
    int
For Loop Line:
    for(; i< 10; ) {
For Loop Initialization:
    none specified in the loop header, its done before the loop starts
For Loop Condition:
    i < 10
    Explanation: Continues the loop as long as i is less than 10.
For Loop Update:
    None specified in the loop header; it's handled inside the loop body.
Print Statement:
    System.out.println("Pass #" + i);
    i++;
        Explanation: prints the current iteration number as "Pass #i".
        Increments i by 1
Execution:
    The loop starts with i at 0
    it prints "Pass#0" and increments i to 1.
    this continues until i reaches 9
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
The loop runs from 0 to 9, printing the current pass number
and incrementing i inside the loop body.
The key point here is that the initialization
and update are managed outside the typical for-loop header,
demonstrating a different but still valid use of loop structure.


*/