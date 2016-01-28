import java.lang.reflect.Array;

/**
 * Created by user on 28.01.2016.
 */
interface Selector<T> {
    boolean end();
    T current();
    void next();
}

public class Sequence<T> {
    private T[] items;
    private int next = 0;

    @SuppressWarnings("unchecked")
    public Sequence(Class<T> clazz, int size) {
//Compile-time error: "Type erasure"
//        items = new T[size];
        items = (T[]) Array.newInstance(clazz, size);

    }

    public void add(T value) {
        if(next < items.length) {
            items[next++] = value;
        }
    }

    private class SequenceSelector<T> implements Selector<T> {
        private int i = 0;

        @Override
        public boolean end() {
            if(i < items.length)
                return false;
            else
                return true;
        }

        @Override
        public T current() {
            return (T) items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }
    }

    public Selector<T> selector() {
        return new SequenceSelector<T>();
    }
}
