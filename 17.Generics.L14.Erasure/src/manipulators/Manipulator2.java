package manipulators;

/**
 * Created by user on 10.02.2016.
 */
public class Manipulator2<T extends HasF> {
    private T item;

    public Manipulator2(T item) {
        this.item = item;
    }

    public void manipulate() {
        item.f();
    }
}
