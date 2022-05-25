package tddProjects;

public class Clock {
    private int hour;
    private int minute;
    private int second;

    public Clock(int hour, int minute, int second){
    }
    public void setHour(int hh){
       hour = hh;
        if (hh > 23){
            hh = 0;
        }
    }
    public int getHour() {
        return hour;
    }
    public void setMinute(int mm) {
        minute = mm;
        if (mm > 59) {
            mm = 0;
        }
    }
    public int getMinute() {
        return minute;
    }
    public void setSecond(int ss){
        second = ss;
        if (ss > 59) {
            ss = 0;
        }
    }
    public int getSecond() {
        return second;
    }

}
