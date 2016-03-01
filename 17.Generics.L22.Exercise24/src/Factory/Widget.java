package Factory;

/**
 * Created by Mike on 22.02.2016.
 */
public class Widget {
    public static class WidgetFactory implements FactoryI<Widget> {
        @Override
        public Widget create(int arg) {
            System.out.println("WidgetFactory.create, arg: " + arg);
            return new Widget();
        }
    }
}
