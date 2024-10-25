package aviel_labs.conditions_loops.examples;

// Loop until an S is typed.
class ForTest {
    public static void main(String args[])
            throws java.io.IOException {

        int i;

        System.out.println("Press S to stop.");

        for(i = 0; (char) System.in.read() != 'S'; i++)
            System.out.println("Pass #" + i);
    }
}
/*
Class Declaration:
    ForTest
Main Method:
    public static void main(String args[])
Variable Declaration:
    int i;
Variable: i
Type: int

For Loop:
    for(i = 0 (char) System.in.read() != 'S'; i++)
For Loop Initialization:
    i = 0
For Loop Condition:
    (char) System.in.read() != 'S'; i++)
        continues te loop as long as the character read from the input is not 'S'
For Loop Update:
    i++
    increments i by 1 after each iteration
Print Statement:
    System.out.println("Pass #" + i);
Execution:
    The loop runs continuously until the user inputs the character 'S'.
    For each iteration, it prints the current pass number (starting from 0).
Output:

Summary:
The code prompts the user to press 'S' to stop.
It enters a loop, reading characters from the input.
For each character read (until 'S' is encountered),
it prints the current iteration number as "Pass #i".
The loop exits when 'S' is pressed, stopping the iteration.
 */