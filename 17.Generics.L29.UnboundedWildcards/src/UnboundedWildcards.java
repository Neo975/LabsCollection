import java.util.List;

/**
 * Created by Michael on 29.03.2016.
 */
public class UnboundedWildcards {
    static List list1;
    static List<?> list2;
    static List<? extends Object> list3;

    public static void assign1(List list) {
        list1 = list;
        list2 = list;
        list3 = list;   //Warning: unchecked conversion
    }

    public static void assign2(List<?> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }

    public static void assign3(List<? extends Object> list) {
        list1 = list;
        list2 = list;
        list3 = list;
    }
}
