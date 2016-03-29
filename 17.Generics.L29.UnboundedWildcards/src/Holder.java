/**
 * Created by user on 29.03.2016.
 */
public class Holder<T> {
    private T value;

    public Holder() {}
    public Holder(T value) { this.value = value; }
    public void set(T value) { this.value = value; }
    public T get() { return value; }
    @Override
    public boolean equals(Object obj) {
        return value.equals(obj);
    }
}
