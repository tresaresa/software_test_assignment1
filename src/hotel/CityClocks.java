package hotel;

import java.util.ArrayList;

public class CityClocks {
    private ArrayList<Clock> clocks;
    private int size;

    public CityClocks(){
        this.clocks = new ArrayList<>();

        // add clocks of 5 cities
        clocks.add(new Clock("beijing", 0, 8));
        clocks.add(new Clock("moscow", 0, 4));
        clocks.add(new Clock("sydney", 0, 10));
        clocks.add(new Clock("london", 0, 0));
        clocks.add(new Clock("new-york", 0, -5));
        this.size = 5;
    }

    public ArrayList<Clock> getClocks() {
        return clocks;
    }

    public int getSize() {
        return size;
    }

    public Clock getClockByName(String n){
        for(Clock c : this.clocks){
            if(c.getName() == n)
                return c;
        }
        return null;
    }
}
