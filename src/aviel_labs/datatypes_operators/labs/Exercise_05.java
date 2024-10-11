package aviel_labs.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
        boolean a = true;
        boolean b = false;
        if (a | b) {
            System.out.println("a or b is true");
        }

        // write your code below
        // example of "short-circuit OR"
        if (a || b) {
            System.out.println("a or b (short-circuit) is true");
        }

        // example of "AND"
        if (a & b) {
            System.out.println("a and b is true");
        }

        // example of "short-circuit AND"
        if (a && b) {
            System.out.println("a and b (short-circuit) is true");
        }

        // example of "XOR"
        if (a ^ b) {
            System.out.println("a xor b is true");
        }

        // example of "NOT"
        if (!a) {
            System.out.println("not a is true");
        }
    }
}

