package PackageOne;

import PackageTwo.Automobile;

/**
 * Created by Mike on 26.01.2016.
 */
public class Holder1 {
    private Automobile a;

    public Holder1(Automobile a) {
        this.a = a;
    };

    Automobile get() {
        return a;
    }
}
