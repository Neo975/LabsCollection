import java.util.Map;

/**
 * Created by Michael on 29.03.2016.
 */
public class UnboundedWildcards2 {
    static Map map1;
    static Map<?, ?> map2;
    static Map<String, ?> map3;

    public static void assign1(Map map) {
        map1 = map;
    }

    public static void assign2(Map<?, ?> map) {
        map2 = map;
    }

    public static void assign3(Map<String, ?> map) {
        map3 = map;
    }
}
