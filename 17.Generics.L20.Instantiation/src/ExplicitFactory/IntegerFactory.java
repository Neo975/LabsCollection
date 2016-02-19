package ExplicitFactory;

/**
 * Created by user on 19.02.2016.
 */
public class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create() {
        return new Integer(0);
    }
}
