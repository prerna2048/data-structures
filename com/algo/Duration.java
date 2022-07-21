package com.algo;

public class Duration {
    private long hrs;
    private long mins;

    public Duration(long hrs, long mins) {
        this.hrs = hrs;
        this.mins = mins;
    }

    public long getHrs() {
        return hrs;
    }

    public void setHrs(long hrs) {
        this.hrs = hrs;
    }

    public long getMins() {
        return mins;
    }

    public void setMins(long mins) {
        this.mins = mins;
    }

    public boolean isThisGreaterDuration(Duration duration) {
        if (this.hrs > duration.hrs) {
            return true;
        } else if (this.hrs == duration.hrs && this.mins > duration.mins) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(hrs).append(" hrs");
        sb.append(mins).append(" mins");
        return sb.toString();
    }
}
