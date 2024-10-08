package aviel_labs.datatypes_operators.examples;

/*
   Compute the distance to a lightening
   strke whose sound takes 7.2 seconds
   to reach you.
*/
class Sound {
    public static void main(String args[]) {
        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lightening is " + dist +
                " feet away.");
    }
}

/*
    Class Declaration:
        the sound class contains the main method
    main method
        variable declaration
            double dist; declares a variable dist of type double to store the distance
        distance calculation
            dist = 7.2 * 100;
            calculates the distance based on the time it takes for the sound of lightning to travel.
            in this case, 7.2 seconds is multiplied by 1100, the speed of sound in feet per second
        output
            prints the calculated distance, showing how far away the lightning is based on the time it took for the sound to reach you
 */