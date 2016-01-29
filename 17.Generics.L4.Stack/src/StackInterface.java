/**
 * Created by user on 29.01.2016.
 */
public interface StackInterface<T> {
    public void push(T object);
    public T pop();
    public T peek();
    public boolean isEmpty();
}
