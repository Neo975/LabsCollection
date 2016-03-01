/**
 * Created by Mike on 27.02.2016.
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

    public void f1() {
        gia = (Generic<Integer>[]) new Object[SIZE];
        int k = 9;
    }

    public void f2() {
        gia = (Generic<Integer>[]) new Generic[SIZE];
    }
}
