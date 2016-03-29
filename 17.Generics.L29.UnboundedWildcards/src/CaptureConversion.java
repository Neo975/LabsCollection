/**
 * Created by user on 29.03.2016.
 */
public class CaptureConversion {
    public static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    public static void f2(Holder<?> holder) {
        f1(holder);     //Call with captured type
    }
}
