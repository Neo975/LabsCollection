import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mike on 17.03.2016.
 */
public class NonCovariantGenerics {
    public static void f() {
        //Compile error: incomatible types:
        //List<CovariantArrays.Fruit> fruitList = new ArrayList<CovariantArrays.Apple>();

        //Wildcards allow covariance:
        List<? extends CovariantArrays.Fruit> fruitList = new ArrayList<CovariantArrays.Apple>();
        CovariantArrays.Fruit f = new CovariantArrays.Fruit();

        //Illegal operation - add
        //fruitList.add(new CovariantArrays.Apple());
        //fruitList.add(new CovariantArrays.Fruit());

        ArrayList<CovariantArrays.Apple> appleList = new ArrayList<CovariantArrays.Apple>();
        appleList.add(new CovariantArrays.Apple());
        appleList.add(new CovariantArrays.Jonathan());
        List<? extends CovariantArrays.Fruit> anotherFruitList = appleList;

        anotherFruitList.get(0);
        anotherFruitList.get(1);
    }
}
