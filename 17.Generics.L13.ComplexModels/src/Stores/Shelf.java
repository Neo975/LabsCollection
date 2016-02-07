package Stores;

import java.util.ArrayList;
import generators.Generators;

/**
 * Created by Mike on 06.02.2016.
 */
public class Shelf extends ArrayList<Product> {
    public Shelf(int nProducts) {
        Generators.fill(this, Product.generator, nProducts);
    }
}
