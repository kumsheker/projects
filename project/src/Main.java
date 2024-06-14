public class Main {
    public static void main(String[] args){
            Bouquet bouquet = new Bouquet();
            bouquet.addFlower(new Chrysanthemum());
            bouquet.addFlower(new Orchid());
            bouquet.addFlower(new Lily());
            bouquet.addFlower(new Peony());
            bouquet.addFlower(new Rose());
            bouquet.addFlower(new Rose());

            Printer.printBouquet(bouquet.getFlowers());
            Printer.printPrice(bouquet.getBouquetCost());
        }
    }
