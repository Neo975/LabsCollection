/**
 * Created by user on 10.02.2016.
 */
public class AnotherClass {
    public static <T extends BasicInterface> void f(T arg) {
        arg.method1();
        arg.method2();
    }
}
