import Stores.Store;
import tuples.FourTuple;

/**
 * Created by Mike on 06.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("TupleList:\n");
        TupleList<Amphibian, Vehicle, String, Integer> tl = new TupleList<Amphibian, Vehicle, String, Integer>();
        tl.add(new FourTuple<Amphibian, Vehicle, String, Integer>(new Amphibian(), new Vehicle(), "hi", 48));
        tl.add(new FourTuple<Amphibian, Vehicle, String, Integer>(new Amphibian(), new Vehicle(), "hi2", 49));
        for(FourTuple<Amphibian, Vehicle, String, Integer> item : tl) {
            System.out.println(item);
        }

        System.out.println("Aisle, Shelf, Product:\n");
        System.out.println(new Store(14, 5, 10));
    }
}
