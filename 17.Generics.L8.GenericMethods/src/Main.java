import generators.CoffeeGenerator;
import generics.coffee.Coffee;
import test_classes.TestClassOne;
import test_classes.TestClassTwo;

import java.util.*;

/**
 * Created by Mike on 31.01.2016.
 */
//        http://blog.decaresystems.ie/2014/04/09/better-type-inference-in-java-8-generics/

public class Main {
    private int t= 44;

    public static void main(String[] args) {
        Byte b = 0x45;
        GenericsMethods gm = new GenericsMethods();

        gm.f("First line classes", "", 1, 1.0);
        gm.f("Second line classes", 1.0F, 'm', b);
        gm.f("Third line classes", gm, gm, gm);

        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> queue = New.queue();

        Set<TestClassOne> ss2 = New.set();

        //  ?????????????????? What the fuck ? WTF!!!
        //It works with language level 8
        //Doesn't work with language levels below
//        GenericsMethods.f(New.map());
        //It works with language level 7
        GenericsMethods.f(New.<TestClassOne, List<? extends TestClassTwo>>map());
        testGenericVarargs();
        testGenerators();
    }

    public static void testGenericVarargs() {
        List<String> ls;

        ls = GenericVarargs.makeList("A");
        System.out.println(ls);
        ls = GenericVarargs.makeList("A", "B", "C", "D", "E");
        System.out.println(ls);
        ls = GenericVarargs.makeList("ABCDEAJDKHSJKFKLFDLFMEPOKPOIOUQIYEOHWJZBNMXCBXCDLSJDJ".split(""));
        System.out.println(ls);
        Arrays.asList("A");
    }

    public static void testGenerators() {
        CoffeeGenerator gen = new CoffeeGenerator();
//        ArrayList<Coffee> list = new ArrayList<>();
        List<Coffee> coffee = Generators.fill(new ArrayList<Coffee>(), gen, 10);
        LinkedList<Coffee> coffee2 = Generators.fill(new LinkedList<Coffee>(), gen, 10);
        System.out.println("testGenerators()");
        for(Coffee c : coffee) {
            System.out.println(c);
        }
    }
}
