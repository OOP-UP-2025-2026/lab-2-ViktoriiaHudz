package ua.opnu;

public class TimeSpan {
    // TODO: add class fields
    private static final int MINUTES_PER_HOUR = 60;

    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        // TODO: write constructor body
        if (hours < 0 || minutes < 0 || minutes >= MINUTES_PER_HOUR) {
            this.hours = 0;
            this.minutes = 0;
            return;
        }

        this.hours = hours;
        this.minutes = minutes;
    }

    int getHours() {
        // TODO: write method body
        return this.hours;
    }

    int getMinutes() {
        // TODO: write method body
        return this.minutes;
    }

    void add(int hours, int minutes) {
        // TODO: write method body
        if (hours < 0 || minutes < 0 || minutes >= MINUTES_PER_HOUR) return;

        int total = getTotalMinutes() + (hours * MINUTES_PER_HOUR + minutes);
        this.hours = total / MINUTES_PER_HOUR;
        this.minutes = total % MINUTES_PER_HOUR;
    }

    void addTimeSpan(TimeSpan timespan) {
        // TODO: write method body
        if (timespan == null) return;
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        // TODO: write method body
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        // TODO: write method body
        return hours * MINUTES_PER_HOUR + minutes;
    }

    void subtract(TimeSpan span) {
        // TODO: write method body
        if (span == null) return;

        int totalThis = getTotalMinutes();
        int totalOther = span.getTotalMinutes();

        if (totalOther > totalThis) {
            return;
        }

        int result = totalThis - totalOther;
        this.hours = result / MINUTES_PER_HOUR;
        this.minutes = result % MINUTES_PER_HOUR;
    }

    void scale(int factor) {
        // TODO: write method body
        if (factor <= 0) return;

        int total = getTotalMinutes() * factor;
        this.hours = total / MINUTES_PER_HOUR;
        this.minutes = total % MINUTES_PER_HOUR;
    }
}
