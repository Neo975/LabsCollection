import java.util.List;

/**
 * Created by user on 29.03.2016.
 */
public class UnboundedWildcards3 {
    public static void f(List rawList) {
        rawList.add(new Integer(4));
        rawList.add(new String());
        rawList.add(new Float(1.04f));
    }

    public static void f2(List<?> unboundedList) {
        String s1 = (String) unboundedList.get(0);
//        String s2 = (String) unboundedList.get(1);  //Runtime error: ClassCastException
    }
}
