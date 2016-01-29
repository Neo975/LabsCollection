import java.util.LinkedList;

/**
 * Created by user on 29.01.2016.
 */
//LIFO
public class StackImplOne<T> implements StackInterface<T> {
    private LinkedList<T> storage = new LinkedList<T>();

    @Override
    public void push(T object) {
        storage.addFirst(object);
    }

    @Override
    public T pop() {
        return storage.removeFirst();
    }

    @Override
    public T peek() {
        return storage.getFirst();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }
}
