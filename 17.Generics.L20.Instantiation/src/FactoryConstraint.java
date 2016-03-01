import ExplicitFactory.Foo2;
import ExplicitFactory.IntegerFactory;
import ExplicitFactory.Widget;
import TemplateMethod.Creator;

/**
 * Created by user on 19.02.2016.
 */
public class FactoryConstraint {
    public static void main(String[] args) {
        Foo2<Integer> f1 = new Foo2<Integer>(new IntegerFactory(), 4);
        Foo2<Widget>  f2 = new Foo2<Widget>(new Widget.Factory(), 5);
        Integer i = f1.getValue();
        Widget w = f2.getValue();

        Creator c = new Creator();
        c.f();
    }
}
