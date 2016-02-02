import test_classes.TestClassOne;
import test_classes.TestClassTwo;

import java.util.List;
import java.util.Map;

/**
 * Created by Mike on 31.01.2016.
 */
public class GenericsMethods {
    public <T, U, V> void f(String description, T x, U u, V v) {
        System.out.println(description + ": " + x.getClass().getName() + ", " + u.getClass().getName() + ", " + v.getClass().getName());
    }

    //Example for test type inference
    public static void f(Map<TestClassOne, List<? extends TestClassTwo>> arg) {
        int t = 9;
        int y = 4;
    }
}
