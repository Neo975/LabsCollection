import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Michael on 29.03.2016.
 */
public class L29 {
    public static void main(String[] args) {
        testUnboundedWildcards();
        testUnboundedWildcards2();
    }

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

    public static void testUnboundedWildcards2() {
        UnboundedWildcards2.assign1(new HashMap());
        UnboundedWildcards2.assign2(new HashMap());
        UnboundedWildcards2.assign3(new HashMap());     //Warning: unchecked conversion. Found: HashMap, required: Map<String, ?>

        UnboundedWildcards2.assign1(new HashMap<String, Integer>());
        UnboundedWildcards2.assign2(new HashMap<String, Integer>());
        UnboundedWildcards2.assign3(new HashMap<String, Integer>());
    }
}
