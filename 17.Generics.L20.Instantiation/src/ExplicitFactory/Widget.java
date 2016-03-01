package ExplicitFactory;

/**
 * Created by user on 19.02.2016.
 */
public class Widget {
    public static class Factory implements FactoryI<Widget> {
        @Override
        public Widget create(int arg) {
            System.out.println("Widget arg " + arg);
            return new Widget();
        }
    }
}
