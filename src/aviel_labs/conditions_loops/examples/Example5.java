package aviel_labs.conditions_loops.examples;

// Demonstrate an if-else-if ladder.
class Ladder {
    public static void main(String args[]) {
        int x;

        for(x=0; x<6; x++) {
            if(x==1)
                System.out.println("x is one");
            else if(x==2)
                System.out.println("x is two");
            else if(x==3)
                System.out.println("x is three");
            else if(x==4)
                System.out.println("x is four");
            else
                System.out.println("x is not between 1 and 4");
        }
    }
}
/*

Execution:
When x is 0: Prints "x is not between 1 and 4".
When x is 1: Prints "x is one".
When x is 2: Prints "x is two".
When x is 3: Prints "x is three".
When x is 4: Prints "x is four".
When x is 5: Prints "x is not between 1 and 4".

Summary:
The program uses a for loop to iterate from 0 to 5.
For each value of x, it checks conditions and prints corresponding messages based on the value of x.

 */