import java.util.LinkedList;

public class Printer {
    public static void printBouquet(LinkedList <Flower> flowers){
        StringBuilder sb = new StringBuilder(flowers.size());
        sb.append("[");
        for (Flower flower:flowers
             ) {
            sb.append(flower.getName());
            sb.append(" ");
        }
        sb.append("]");
        System.out.println(sb.toString());}
    public static void printPrice(int price){
        System.out.println("Price of this bouquet is  " + price);
    }
}
