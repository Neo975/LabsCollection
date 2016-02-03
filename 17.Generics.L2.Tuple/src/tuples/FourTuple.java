package tuples;

/**
 * Created by Mike on 27.01.2016.
 */
public class FourTuple<A, B, C, D> extends ThreeTuple {
    public final D fourth;

    public FourTuple(A a, B b, C c, D d) {
        super(a, b ,c);
        fourth = d;
    }

    public String toString() {
        return super.toString() + ", " + fourth + ")";
    }
}
