import Factory.IntegerFactory;
import Factory.Widget;

/**
 * Created by Mike on 22.02.2016.
 */
public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        FactoryCapture factoryCapture = new FactoryCapture();
        factoryCapture.addFactory("Widget", new Widget.WidgetFactory());
        factoryCapture.addFactory("Integer", new IntegerFactory());
        factoryCapture.create("Widget", 77);
        factoryCapture.create("Integer", 44);
        factoryCapture.create("String", 4);
    }
}
