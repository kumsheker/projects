package Load;

import Load.Load;

public class Tank implements Load {
    private final int density;
    private final int mass;
    private final int volumeOfTank;
    private final int massOfTank = 100;
    public Tank(int density, int volumeOfTank){
        this.density = density;
        this.volumeOfTank = volumeOfTank;
        this.mass = density*volumeOfTank + massOfTank;
    }

    @Override
    public int getMass() {
        return mass;
    }
    @Override
    public String toString(){
        return String.format("Tank(%d, %d, %d)", density, mass, volumeOfTank);
    }
}
