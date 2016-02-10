import migration.Derived1;
import migration.Derived2;
import migration.GenericBase;

import java.util.Arrays;

/**
 * Created by user on 10.02.2016.
 */
public class Main {
//    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Foo<Integer> foo = new Foo<Integer>();
        FooUnparam fooUnparam = new FooUnparam();
        System.out.println(Arrays.toString(foo.getClass().getTypeParameters()));
        System.out.println(Arrays.toString(fooUnparam.getClass().getTypeParameters()));
        System.out.println("-------------------------------------- Derived2, Inheritance -------------------------------------");
/*
        Derived2 d2 = new Derived2();
        Object obj2 = d2.get();
        d2.set(obj2); // Warning here !!!
*/
        //There is exist "unchecked" warning
        Derived1 d11 = new Derived1();
        Object obj11 = d11.get();
        d11.set(obj11); // Warning here !!!

        //There is exist no "unchecked" warning
        Derived1<Object> d12 = new Derived1<Object>();
        Object obj12 = d12.get();
        d12.set(obj12); // No warning here
    }
}
