/**
 * Created by Mike on 27.02.2016.
 */
public class ArrayOfGeneric {
    static final int SIZE = 100;
    static Generic<Integer>[] gia;

//Causes ClassCastException
    public void f1() {
        gia = (Generic<Integer>[]) new Object[SIZE];
        int k = 9;
    }

    public void f2() {
        gia = (Generic<Integer>[]) new Generic[SIZE];
        gia[0] = new Generic<Integer>();

//Causes ClassCastException
//        gia[1] = (Generic<Integer>) new Object();

        int k =9;
    }
}
