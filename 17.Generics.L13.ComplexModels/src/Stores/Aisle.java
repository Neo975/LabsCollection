package Stores;

import java.util.ArrayList;

/**
 * Created by Mike on 06.02.2016.
 */
public class Aisle extends ArrayList<Shelf> {
    public Aisle(int nShelves, int nProducts) {
        for(int i = 0; i < nShelves; i++) {
            add(new Shelf(nProducts));
        }
    }
}
