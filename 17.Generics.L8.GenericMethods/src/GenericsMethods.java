/**
 * Created by Mike on 31.01.2016.
 */
public class GenericsMethods {
    public <T, U, V> void f(String description, T x, U u, V v) {
        System.out.println(description + ": " + x.getClass().getName() + ", " + u.getClass().getName() + ", " + v.getClass().getName());
    }
}
