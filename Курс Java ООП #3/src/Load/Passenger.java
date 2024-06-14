package Load;

import Load.Load;

public class Passenger implements Load {
    private final int mass;
    public Passenger(int mass){
        this.mass = mass;
    }

    @Override
    public int getMass() {
        return mass;
    }
    @Override
    public String toString(){
        return String.format("Passenger(%d)", mass);
    }
}
