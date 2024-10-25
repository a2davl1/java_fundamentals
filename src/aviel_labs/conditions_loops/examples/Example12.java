package aviel_labs.conditions_loops.examples;

// A negatively running for loop.
class DecrFor {
    public static void main(String args[]) {
        int x;

        for(x = 100; x > -100; x -= 5)
            System.out.println(x);
    }
}

/*
for(count=10; count < 5; count++)
  x += count; // this statement will not execute
 */
/*
Class Declaration:
    DecrFor
Main Method:
    public static void main(String args[]) {
Variable Declaration:
    int x;
    declares a variable x of type int
For Loop:
    for(x = 100; x > -100; x -= 5)
Print Statement:
    System.out.println(x);
Execution:
The loop starts with x at 100 and decrements x by 5 in each iteration.
The loop continues until x is no longer greater than -100.

Output:

Summary:
The code uses a for loop to decrement x from 100 down to -95,
printing each value in between at intervals of 5.

 */