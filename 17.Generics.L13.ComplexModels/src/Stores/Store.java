package Stores;

import java.util.ArrayList;

/**
 * Created by Mike on 06.02.2016.
 */
public class Store extends ArrayList<Aisle>{
    private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
    private Office office = new Office();

    public Store(int nAisles, int nShelves, int nProducts) {
        for(int i = 0; i < nAisles; i++) {
            add(new Aisle(nShelves, nProducts));
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for(Aisle a : this) {
            for(Shelf s : a) {
                for(Product p : s) {
                    result.append(p + "\n");
                }
            }
        }
        return result.toString();
    }
}
