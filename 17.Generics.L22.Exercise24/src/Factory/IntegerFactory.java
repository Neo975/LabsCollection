package Factory;

/**
 * Created by Mike on 22.02.2016.
 */
public class IntegerFactory implements FactoryI<Integer> {
    @Override
    public Integer create(int arg) {
        System.out.println("IntegerFactory.create, arg: " + arg);
        return new Integer(arg);
    }
}
