package tuples;

/**
 * Created by Mike on 27.01.2016.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b) {
        first = a;
        second = b;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}
