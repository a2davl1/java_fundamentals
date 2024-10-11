package aviel_labs.datatypes_operators.labs;

/**
 * Please demonstrate the use of all relational operators below. These include:
 *
 * less than, less than or equal to, greater than, greater than or equal to, and equal to
 *
 */
class RelationalOperators {

    public static void main(String[] args) {

        // example of "less than"
        int a = 1;
        int b = 2;
        if (a < b) {
            System.out.println("a is less than b");
        }

        // write your code below
        // example of "less than or equal to"
        if (a <= b) {
            System.out.println("a is less than or equal to b");
        }

        // example of "greater than"
        if (b > a) {
            System.out.println("b is greater than a");
        }

        // example of "greater than or equal to"
        if (b >= a) {
            System.out.println("b is greater than or equal to a");
        }

        // example of "equal to"
        if (a == 1) {
            System.out.println("a is equal to 1");
        }

        // example of "not equal to"
        if (a != b) {
            System.out.println("a is not equal to b");
        }
    }
}