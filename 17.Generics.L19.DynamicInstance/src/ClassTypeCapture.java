import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 13.02.2016.
 */
class Building {}

class House extends Building {}

public class ClassTypeCapture<T> {
    private Class<T> kind;
    private static Map<String, Class<?>> mapTypes = new HashMap<String, Class<?>>();

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static Object createNew(String typename) {
        Object cl = null;

        try {
            cl = mapTypes.get(typename).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return cl;
    }

    public static void addType(String typename, Class<?> kind) {
        mapTypes.put(typename, kind);
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        addType("String", String.class);
        addType("House", House.class);
        addType("Integer", Integer.class);

        House h = (House) createNew("House");
        Integer i = (Integer) createNew("Integer");
    }
}

