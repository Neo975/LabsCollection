package TemplateMethod;

/**
 * Created by Mike on 19.02.2016.
 */
public class Creator extends GenericWithCreate<X> {

    @Override
    X create() {
        return new X();
    }

    public void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
