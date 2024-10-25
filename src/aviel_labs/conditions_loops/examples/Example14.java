package aviel_labs.conditions_loops.examples;

// Use commas in a for statememt.
class Comma {
    public static void main(String args[]) {
        int i, j;

        for(i=0, j=10; i < j; i++, j--)
            System.out.println("i and j: " + i + " " + j);
    }
}

/*
Class Declaration:
    Comma
Main Method:
    public static void main(String args[]) {
Variable Declaration:
    int i and j
        Variable: i, j
        Type: int
For Loop:
    for(1=0, j=10; i < j; i++, j--)
For Loop initialization:
    i=0, j=10
    Starts the loop with i initialized to 0 and j initialized to 10
For Loop Condition:
    i < j
    continues the loop as long as i is less than j
For Loop Update:
    i++, j--
    - increments - by 1 and decrements j by 1 after each iteration
Print Statement:
    System.out.println("i and j: " + i + " " + j);
Execution:
    On each iteration, the loop prints the values of i and j,incrementing i
    and decrementing j.
    The loop stops when i is no longer less than j.

Output:
i and j: 0 10
i and j: 1 9
i and j: 2 8
i and j: 3 7
i and j: 4 6
i and j: 5 5

Summary:
The loop starts with i at 0 and j at 10.
It prints their values and updates i and j until they meet in the middle.
The loop stops when i is no longer less than j (i.e., when i equals j).

 */