package Load;

import Load.Load;

public class Platform implements Load {
    private final int mass;
    public Platform(int mass){
        this.mass = mass;
    }
    @Override
    public int getMass(){
        return mass;
    }
    @Override
    public String toString(){
        return String.format("Platform(%d)", mass);
    }
}
