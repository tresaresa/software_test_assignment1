package hotel;

public class Controller {
    private Clock conClock;
    private CityClocks cityClocks;

    public Controller(){
        this.conClock = new Clock("controller", 0, 8);
        this.cityClocks = new CityClocks();
    }

    public Clock getConClock() {
        return conClock;
    }

    public CityClocks getCityClocks() {
        return cityClocks;
    }

    // adjust all clocks according to the input time (beijing time)
    public void adjustClocks(int time){
        for(Clock c : cityClocks.getClocks()){
            c.setTime(time - conClock.getOffset() + c.getOffset());
        }
    }
}
