// classes
public class Time1 {

    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {

        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {

            // predefined exception class that is specifically meant for the purpose of indicating
            // to a calling method, that it passed an argument that was not appropriate for the method.
            throw new IllegalArgumentException("hour, minute, second should be between 0 and 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // convert to String in universal time format (HH:MM:SS).
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)

    @Override
    public String toString() {
        //%d: %02d: %02d %s => H : MM : SS AM/PM
        return String.format("%d:%02d:%02d %s",
            ((hour == 0 || hour == 12) ? 12 : hour % 12),
            minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
