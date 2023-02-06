public class Time2Test {

    public static void main(String[] args) {

        Time2 t1 = new Time2();         // 00:00:00 ()
        Time2 t2 = new Time2(2);        // 02:00:00 (HH)
        Time2 t3 = new Time2(21,34);    // 21:34:00 (HH : MM)
        Time2 t4 = new Time2(12,25,42); // 12:25:42 (HH : MM : SS)
        Time2 t5 = new Time2(t4);       // "                     "

        System.out.printf("%n", "Constructed with: ");
        displayTime("t1: all default params ", t1);
        displayTime("t2: hour specified; default min and sec ", t2);
        displayTime("t3: hour and minute specified; default second ", t3);
        displayTime("t4: hour, minute and second specified ", t4);
        displayTime("t5: TIme2 object t4 specified ", t5);

        try {
            Time2 t6 = new Time2(27, 74, 99);
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    public static void displayTime(String string, Time2 time){
        System.out.printf("%s%n    %s%n    %n%n",
            string, time.toUniversalString(), time.toString());
    }
}
