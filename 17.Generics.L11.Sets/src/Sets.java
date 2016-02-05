import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by user on 04.02.2016.
 */
public class Sets {
    public static <T> Set<T> copy(Set<T> a) {
        if(a instanceof EnumSet) {
            return ((EnumSet)a).clone();
        } else {
            return new HashSet<T>(a);
        }
    }

    public static <T> Set<T> union(Set<T> a, Set<T> b) {
//        Set<T> result = new HashSet<T>(a);
        Set<T> result = copy(a);
        result.addAll(b);

        return result;
    }

    public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
//        Set<T> result = new HashSet<T>(a);
        Set<T> result = copy(a);
        result.retainAll(b);

        return result;
    }

    public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
//        Set<T> result = new HashSet<T>(superset);
        Set<T> result = copy(superset);
        result.removeAll(subset);

        return result;
    }

    public static <T> Set<T> complement(Set<T> a, Set<T> b) {
        Set<T> result = difference(union(a, b), intersection(a, b));

        return result;
    }
}
