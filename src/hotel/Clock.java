package hotel;

public class Clock {
    private String name;
    private int time;
    private int offset;

    public Clock(String n, int t, int o){
        this.name = n;
        this.time = t;
        this.offset = o;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }
}
