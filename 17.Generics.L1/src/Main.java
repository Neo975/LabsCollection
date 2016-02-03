import PackageOne.Holder1;
import PackageOne.Holder2;
import PackageOne.Holder3;
import PackageTwo.Automobile;
import PackageTwo.AutomobileChild;

/**
 * Created by Mike on 26.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        Holder1 h1 = new Holder1(new Automobile());
        Holder2 h2 = new Holder2(new Automobile());
        h2.set(new String("dfgddg"));
        h2.set(1);
        Integer i = (Integer) h2.get();

        Holder3<String> h3_string = new Holder3<>("String value");
        Holder3<Integer> h3_integer = new Holder3<>(45);
        Holder3<Automobile> h3_automobile = new Holder3<>(new Automobile());
        Holder3<AutomobileChild> h3_automobile_child = new Holder3<>(new AutomobileChild());

        h3_automobile.set(new AutomobileChild());
//        h3_automobile_child.set(new Automobile());

        int finalValue = 11;
    }
}
