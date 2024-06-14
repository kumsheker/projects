import Load.Load;
import Load.Passenger;
import Load.Container;
import java.util.Comparator;
import Load.Platform;
import Load.Tank;
public class LoadCompare implements Comparator<Load> {

    @Override
    public int compare(Load o1,Load o2) {
         int difMass = o1.getMass() - o2.getMass();
         if(difMass != 0 && (o1.getClass() == Passenger.class || o2.getClass() == Passenger.class)){
             return difMass;}

         if(difMass != 0 && (o1.getClass() == Container.class || o2.getClass() == Container.class)){
            return difMass;
         }
         if(difMass != 0 && (o1.getClass() == Platform.class || o2.getClass() == Platform.class)){
             return difMass;
         }
         if(difMass != 0 && (o1.getClass() == Tank.class || o2.getClass() == Tank.class)){
             return difMass;
         }return difMass;

    }
}
