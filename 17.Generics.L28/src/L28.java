import typeinfo.pets.*;

/**
 * Created by Mike on 27.03.2016.
 */
public class L28 {
    public static void main(String[] args) {
        Generic1<Rodent> g1 = new Generic1<Rodent>();
        f1(g1, new Mouse());
        f1(g1, new Rodent());
//        f1(g1, new Cat());  //Error

        Generic2<Pet> g2 = new Generic2<Pet>();
        Pet pet = f2(g2);
        Generic2<Cat> g3 = new Generic2<Cat>();
        Cat cat = f2(g3);
        pet = f2(g3);
    }

    static <T> void f1(Generic1<? super T> obj, T item) {
        obj.set(item);
    }

    static <T> T f2(Generic2<? extends T> obj) {
        return obj.get();
    }
}
