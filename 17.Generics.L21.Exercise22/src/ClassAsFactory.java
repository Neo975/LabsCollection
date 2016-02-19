import java.io.IOException;
import java.lang.reflect.Constructor;

/**
 * Created by Mike on 19.02.2016.
 */
public class ClassAsFactory<T> {
    T x;
    public ClassAsFactory(Class<T> kind) {
        try {
            x = kind.newInstance();
            Constructor c;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
