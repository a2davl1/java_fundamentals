package aviel_labs.fundamentals.exercise05;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"
        int strLength = str.length();
        System.out.println("Length of 'str': " + strLength);

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean areEqual = str.equals(str2);
        System.out.println("Are 'str' and 'str2' equal? " + areEqual);

        // please concatenate str & str2 and set the result to a new String variable below
        String concatenatedStr = str.concat(str2);
        System.out.println("Concatenated string: " + concatenatedStr);

        // please demonstrate the use of any other method that is available to us in the String class
        String original = "Hello, world!";
        String replaced = original.replace("world", "universe");
        System.out.println("Replaced string: " + replaced);

        // for example, replace(), substring(), contains(), indexOf() etc
        String sub = original.substring(7, 12); // Get a substring from index 7 to 11 (inclusive)
        System.out.println("Substring: " + sub);

        boolean containsHello = original.contains("Hello"); // Check if "original" contains "Hello"
        System.out.println("Does 'original' contain 'Hello'? " + containsHello);

        int indexOfComma = original.indexOf(","); // Find the index of the comma
        System.out.println("Index of comma: " + indexOfComma);


    }


}