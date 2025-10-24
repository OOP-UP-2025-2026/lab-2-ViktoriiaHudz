package ua.opnu;


public class TimeSpan {
    // TODO: add class fields
    private int hours;
    private int minutes;

    TimeSpan(int hours, int minutes) {
        // TODO: write constructor body
        if (hours < 0 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Invalid time values");
        }
        this.hours = hours;
        this.minutes = minutes;
    }


    int getHours() {
        return hours;
    }

    int getMinutes() {
        // TODO: write method body
        return minutes;
    }

    void add(int hours, int minutes) {
        // TODO: write method body
        if (hours < 0 || minutes < 0 || minutes > 59) {
            return;
        }
        int totalMinutes = this.minutes + minutes;
        this.hours += hours + totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }


    void addTimeSpan(TimeSpan timespan) {
        // TODO: write method body
        add(timespan.getHours(), timespan.getMinutes());
    }

    double getTotalHours() {
        // TODO: write method body
        return hours + minutes / 60.0;
    }

    int getTotalMinutes() {
        // TODO: write method body
        return hours * 60 + minutes;
    }

    void subtract(TimeSpan span) {
        // TODO: write method body
        int totalCurrent = this.getTotalMinutes();
        int totalSubtract = span.getTotalMinutes();

        if (totalSubtract > totalCurrent) {
            throw new IllegalArgumentException("Cannot subtract larger timespan");
        }

        int result = totalCurrent - totalSubtract;
        this.hours = result / 60;
        this.minutes = result % 60;
    }


    void scale(int factor) {
        // TODO: write method body
        if (factor <= 0) return;
        int totalMinutes = getTotalMinutes() * factor;
        this.hours = totalMinutes / 60;
        this.minutes = totalMinutes % 60;
    }
}