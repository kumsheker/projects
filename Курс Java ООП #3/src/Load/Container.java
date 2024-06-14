package Load;

import Load.Load;

public class Container implements Load {

    private final int massOfContainer = 100;
    private final int density;
    private final int volumeOfContainer;
    private final int mass;
    public Container(int density, int volumeOfContainer){
        this.density = density;
        this.volumeOfContainer = volumeOfContainer;
        this.mass = density * volumeOfContainer + massOfContainer;
    }

    @Override
    public int getMass() {
        return this.mass;
    }
    @Override
    public String toString(){
        return String.format("Container(%d, %d)", density, volumeOfContainer);
    }
}
