package migration;

/**
 * Created by user on 10.02.2016.
 */
public class GenericBase<T> {
    private T element;

    public void set(T arg) {
        element = arg;
    }

    public T get() {
        return element;
    }
}
