import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 17.03.2016.
 */
public class L25 {
    public static void main(String[] args) {
        CovariantArrays.f();
        NonCovariantGenerics.f();

        List<CovariantArrays.Fruit> listFruits = new ArrayList<CovariantArrays.Fruit>();
    }
}
