/**
 * Created by Mike on 27.03.2016.
 */
public interface Box<T> {
    public T get();
    public void put(T element);
    public void put(Box<T> box);
    public void putExtended(Box<? extends T> box);
    public boolean containsSame(Box<? extends T> other, EqualityComparator<T> comparator);
    public boolean containsSameExtended(Box<? extends T> other, EqualityComparator<? super T> comparator);

    public interface EqualityComparator<T> {
        public boolean compare(T first, T second);
    }
}
