public class Date {

    // primitive-type instance variables, composed fully within object
    private int month;
    private int day;
    private int year;

    private static final int[] daysPerMonth = {0,31,28,31,30,31,30,31,31,30,31,30,31};

    // confirm proper value for month and day give the year
    public Date(int month, int day, int year) {

        if(month <= 0 || month > 12) {
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        }

        // check for leap year
        if(day <= 0 || day > daysPerMonth[month] && !(month == 2 && day == 29)) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for given year.");
        }

        // if month is 2 and day is 29, make sure the year is good (leap year)
        if (month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            throw new IllegalArgumentException("day (" + day + ") out-of-range for given year.");
        }

        this.month = month;
        this.day = day;
        this.year = year;

        // this references the current Date object being constructed -- call toString()
        System.out.printf("Date object constructor for date %s%n", this);
        System.out.println();
    }

    @Override
    public String toString() {
        return String.format("%d/%d/%d", month, day, year);
    }
}