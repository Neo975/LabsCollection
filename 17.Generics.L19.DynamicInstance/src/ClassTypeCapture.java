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

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }

    public static Map<String, Class<?>> createNew(String typename) {
        Class<?> obj;
        Map<String, Class<?>> typeMap = null;

        try {
            obj = Class.forName(typename);
            typeMap = new HashMap<String, Class<?>>();
            typeMap.put(typename, obj);
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
            return null;
        }

        return typeMap;
    }

    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 = new ClassTypeCapture<>(Building.class);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 = new ClassTypeCapture<>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));

        Map<String, Class<?>> map = createNew(House.class.getName());
        Object value;
        Constructor<?>[] cc = Integer.class.getConstructors();
        try {
            House.class.newInstance();      //Can instantiate, exist default constructor
            Class<?> cl = map.get(House.class.getName());
            cl.newInstance();
            Integer.class.newInstance();    //Can't instantiate, not exist default constructor
            value = map.get(Integer.class.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        int t = 9;
    }
}

