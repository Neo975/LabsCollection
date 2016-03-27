import java.util.List;

/**
 * Created by Mike on 27.03.2016.
 */
public class BoxImpl<T> implements Box<T> {
    public T get() {
        return null;
    }

    public void put(T element) {
    }

    public void put(Box<T> box) {
    }

    public void putExtended(Box<? extends T> box) {

    }

    public boolean containsSame(Box<? extends T> other, EqualityComparator<T> comparator) {
        return false;
    }

    public boolean containsSameExtended(Box<? extends T> other, EqualityComparator<? super T> comparator) {
        return false;
    }

    public static <T> void sort(T list) {
    }
}
