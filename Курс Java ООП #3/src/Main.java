import Load.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Ship ship1 = new Ship(1000);
        ship1.add(Arrays.asList(
                new Container(14, 11),
                new Tank(18, 5),
                new Platform(133),
                new Passenger(75),
                new Tank(13, 5),
                new Passenger(70),
                new Platform(111),
                new Container(11, 11)));

        for (Load l:ship1.getLoad()){
            System.out.println(l);
        }
        System.out.println("------");


        ship1.getLoad().sort(new LoadCompare());
        for (Load l:ship1.getLoad()){
            System.out.println(l);
        }

        int mass=0;
        for (Load l:ship1.getLoad()
             ) {
            mass += l.getMass();
        }
        System.out.println(ship1.getPayload() > mass);
    }

}
