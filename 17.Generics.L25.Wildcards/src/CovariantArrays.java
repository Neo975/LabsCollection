/**
 * Created by Mike on 17.03.2016.
 */
public class CovariantArrays {
    public static class Fruit {}
    public static class Apple extends Fruit {}
    public static class Jonathan extends Apple {}
    public static class Orange extends Fruit {}

    public static void f() {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();    // OK
        fruits[1] = new Jonathan(); // OK

        try {
            fruits[2] = new Fruit();// Runtime error, ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            fruits[2] = new Orange();// Runtime error, ArrayStoreException
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
