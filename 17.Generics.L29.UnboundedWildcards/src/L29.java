import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Michael on 29.03.2016.
test string
 */
public class L29 {
    public static void main(String[] args) {
        testUnboundedWildcards();
        testUnboundedWildcards2();
        testUnboundedWildcards3();
        testCaptureConversion();
    }

    @SuppressWarnings("unchecked")
    public static void testUnboundedWildcards() {
        UnboundedWildcards.assign1(new ArrayList());
        UnboundedWildcards.assign2(new ArrayList());
        UnboundedWildcards.assign3(new ArrayList());    //Warning: unchecked conversion. Found: ArrayList, required: List<? extends Object>

        UnboundedWildcards.assign1(new ArrayList<String>());
        UnboundedWildcards.assign2(new ArrayList<String>());
        UnboundedWildcards.assign3(new ArrayList<String>());

        List<?> wildList = new ArrayList();
        wildList = new ArrayList<String>();
        UnboundedWildcards.assign1(wildList);
        UnboundedWildcards.assign2(wildList);
        UnboundedWildcards.assign3(wildList);
    }

    @SuppressWarnings("unchecked")
    public static void testUnboundedWildcards2() {
        UnboundedWildcards2.assign1(new HashMap());
        UnboundedWildcards2.assign2(new HashMap());
        UnboundedWildcards2.assign3(new HashMap());     //Warning: unchecked conversion. Found: HashMap, required: Map<String, ?>

        UnboundedWildcards2.assign1(new HashMap<String, Integer>());
        UnboundedWildcards2.assign2(new HashMap<String, Integer>());
        UnboundedWildcards2.assign3(new HashMap<String, Integer>());
    }

    @SuppressWarnings("unchecked")
    public static void testUnboundedWildcards3() {
        List list = new ArrayList();
        list.add(new String("sss"));
        list.add(new Integer(4));
        UnboundedWildcards3.f2(list);
    }

    public static void testCaptureConversion() {
        Holder raw = new Holder<Integer>(1);
//        CaptureConversion.f1(raw);  //Produced warnings
        CaptureConversion.f2(raw);

        Holder rawBasic = new Holder();
        rawBasic.set(new Object());   //Warning
        CaptureConversion.f2(rawBasic);

        Holder<?> wildcarded = new Holder<Double>(1.0);
        CaptureConversion.f2(wildcarded);
    }
}
