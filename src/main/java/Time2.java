import javax.swing.plaf.BorderUIResource;

// classes
public class Time2 {

    // fields, getters, setters
    // ------------------------

    private int hour;
    private int minute;
    private int second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        // validation is same in validation constructor
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if(hour < 0 || hour >=24) {
            throw new IllegalArgumentException ("hour must be 0-23");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if(minute < 0 || minute >=60) {
            throw new IllegalArgumentException ("minute must be 0-59");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if(second < 0 || second >=60) {
            throw new IllegalArgumentException ("second must be 0-59");
        }
        this.second = second;
    }


    // Constructors
    // ------------

    // validation constructor
    public Time2(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24) {
            throw new IllegalArgumentException("hour must be 0-23");
        }

        if(minute < 0 || minute >= 60) {
            throw new IllegalArgumentException("minute must be 0-59");
        }

        if(second < 0 || second >= 60) {
            throw new IllegalArgumentException("second must be 0-59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2() {
        this(0,0,0);
    }

    public Time2(int hour) {
        this(hour,0,0);
    }

    public Time2(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time2(Time2 time) {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }


    // Methods
    // -------

    // convert to String in universal time format (HH:MM:SS).
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)

    @Override
    public String toString() {
        //%d: %02d: %02d %s => H : MM : SS AM/PM
        return String.format("%d:%02d:%02d %s",
            ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
            getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}
