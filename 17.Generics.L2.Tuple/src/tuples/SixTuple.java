package tuples;

/**
 * Created by user on 04.02.2016.
 */
public class SixTuple<A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{
    public final F six;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        six = f;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + six + ")";
    }
}
