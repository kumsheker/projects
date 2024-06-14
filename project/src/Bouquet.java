
import java.util.LinkedList;

public class Bouquet implements IBouquet{

    private LinkedList<Flower> flowers;
    public LinkedList<Flower> getFlowers(){
        return flowers;
    }

    @Override
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    @Override
    public int getBouquetCost() {
        int sum=0;
        for(Flower f : flowers){
            if(f!=null)
                sum += f.getPrice();
            else break;
        }return sum;
    }
    public Bouquet(){
        flowers = new LinkedList<>();
    }
}
