// classes
public class Time1Test {

    public static void main(String[] args) {

        Time1 time = new Time1();

        // output the string rep. of time.
        displayTime("After time object is created", time);
        System.out.println();

        // change time and output updated time
        time.setTime(13,27,6);
        displayTime("After time object is created", time);
        System.out.println();

        // throw an exception
        try {
            time.setTime(99,99,99);
        } catch (IllegalArgumentException e) {
            System.out.printf("Exception: %s%n", e.getMessage());
        }

        displayTime("After exception", time);

    }

    private static void displayTime(String msg, Time1 time) {
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
            msg, time.toUniversalString(), time.toString());
    }
}
