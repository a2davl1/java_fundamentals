package aviel_labs.datatypes_operators.examples;

/*
   This program attempts to declared a variable
   in an inner scope with the same name as one
   defined in an outer scope.

   *** This program will not compile. ***
*/

/*
complies but enters infinite for loop because
count keeps getting reset to 0

Update- does not compile when i is reinitialized
*/
class NestVar {
    public static void main(String args[]) {
        int count;

        for(count = 0; count < 10; count = count+1) {
            System.out.println("This is count: " + count);

            //int count; // illegal!!!
            for(count = 0; count < 2; count++)
                System.out.println("This program is in error!");
        }
    }
}

/*
    Class Declaration
        The NestVar class contains the main method
    Main Method
        Variable Declration:
            int count; declares a variable count that is accessible within the main method
        Outer for Loop:
            for(count = 0; count < 10; count = count+1)
                initializes count to 0 and runs the loop while count is less than 10.
                After each iteration, it increments count by 1.
            System.out.println("This is count: " + count);
                prints the value of count during each iteration.
        Innner for Loop:
            The commmented out line //int count; // illegal!!!
                shows that declaring another variable named count within this scope is
                illegal because the variable count is already declared in the enclosing scope.
            for(count = 0; count < 2: count++)
                runs a nested loop which will over write the value of count from the outer loop
                causing confusion and logic errors.
            System.out.println("This program is in error!");
                prints a message indicating an error in the program's logic.
    Key Points:
        Variable Scope:
            The variable count is declared in the main method and should ideally not be
                redclared or reused within the inner loop.
            Declaring count again within the inner loop would cause a compilation error because
                it's already declared in the enclosing scope.
        Logic Error:
            The inner loop overwrites the value of count, leading to incorrect behavior and confusion.
    The key takeaway here is the importance of variable scope and avoiding variable shadowing,
        which can lead to errors and difficult-to-debug code.

 */