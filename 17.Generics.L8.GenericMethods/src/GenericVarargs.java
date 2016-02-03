import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 03.02.2016.
 */
public class GenericVarargs {
    public static <T> List<T> makeList(T... args) {
        List<T> result = new ArrayList<T>();
        for(T item : args) {
            result.add(item);
        }

        return result;
    }
}
