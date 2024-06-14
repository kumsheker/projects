import Load.Load;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    private final int payload;
    private ArrayList<Load> load;

    public Ship(int payload) {
        this.payload = payload;
        load = new ArrayList<Load>();

    }

    public void add(Load load){
        this.load.add(load);
    }
    public void add(List<Load> listOfLoads){
        this.load.addAll(listOfLoads);
    }
    public ArrayList<Load> getLoad(){
        return this.load;
    }

    public int getPayload() {
        return payload;
    }
}
