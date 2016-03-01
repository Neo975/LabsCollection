package ExplicitFactory;

/**
 * Created by user on 19.02.2016.
 */
public interface FactoryI<T> {
    T create(int arg);
}
