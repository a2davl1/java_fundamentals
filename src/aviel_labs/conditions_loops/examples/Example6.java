package aviel_labs.conditions_loops.examples;

// Demonstrate the switch.
class SwitchDemo {
    public static void main(String args[]) {
        int i;

        for(i=0; i<10; i++)
            switch(i) {

                case 0:   System.out.println("i is zero");
                    break;
                case 1:
                    System.out.println("i is one");
                    break;
                case 2:
                    System.out.println("i is two");
                    break;
                case 3:
                    System.out.println("i is three");
                    break;
                case 4:
                    System.out.println("i is four");
                    break;
                default:
                    System.out.println("i is five or more");
            }

    }
}

/*
Execution:
When i is 0: Prints "i is zero".

When i is 1: Prints "i is one".

When i is 2: Prints "i is two".

When i is 3: Prints "i is three".

When i is 4: Prints "i is four".

When i is 5, 6, 7, 8, 9: Prints "i is five or more".

Summary:
The loop iterates from 0 to 9 and uses a switch statement to print a specific message based on the value of i.
If i is 0 to 4, it prints the respective value message. For values 5 and above, it prints "i is five or more".

 */