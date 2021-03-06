package com.b2msolutions.reyna.blackout;

public class TimeRange {

    private final Time from;

    private final Time to;

    public TimeRange(Time from, Time to) {
        this.from = from;
        this.to = to;
    }

    public Time getTo() {
        return to;
    }

    public Time getFrom() {
        return from;
    }

    public boolean contains(Time time) {
        if(from.getMinuteOfDay() == to.getMinuteOfDay()) return false;

        if(this.to.isAfterOrEqualTo(this.from)) {
            return time.isAfterOrEqualTo(this.from) && time.isBeforeOrEqualTo(this.to);
        } else {
            return time.isAfterOrEqualTo(this.from) || time.isBeforeOrEqualTo(this.to);
        }
    }
}
