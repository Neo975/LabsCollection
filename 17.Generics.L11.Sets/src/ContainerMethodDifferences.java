import java.lang.reflect.Method;
import java.util.*;

/**
 * Created by user on 04.02.2016.
 */
public class ContainerMethodDifferences {
    public static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<String>();
        for(Method m : type.getMethods()) {
            result.add(m.getName());
        }
        return result;
    }

    public static void interfaces(Class<?> type) {
        System.out.print("Interfaces in " + type.getSimpleName() + ": ");
        List<String> result = new ArrayList<String>();
        for(Class<?> c : type.getInterfaces()) {
            result.add(c.getSimpleName());
        }
        System.out.println(result);
    }

    static Set<String> object = methodSet(Object.class);
    static {
        object.add("clone");
    }

    public static void difference(Class<?> superset, Class<?> subset) {
        System.out.print(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(subset), methodSet(subset));
        comp.removeAll(object); //Don't show Object class methods
        System.out.println(comp);
        interfaces(superset);
    }
}
