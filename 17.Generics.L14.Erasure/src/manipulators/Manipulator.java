package manipulators;

/**
 * Created by user on 10.02.2016.
 */
public class Manipulator<T> {
    private T item;

    public Manipulator(T item) {
        this.item = item;
    }

    public void manipulate() {
        //CompileTimeError: cannot find symbol: method f()
        //item.f();
    }
}
