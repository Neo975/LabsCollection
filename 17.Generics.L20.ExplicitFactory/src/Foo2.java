/**
 * Created by user on 19.02.2016.
 */
public class Foo2<T> {
    private T x;
    public <F extends FactoryI<T>> Foo2(F factory) {
        x = factory.create();
    }
}
