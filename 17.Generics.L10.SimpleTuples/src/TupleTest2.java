import static tuple.Tuple.*;

import tuples.*;

import java.util.DoubleSummaryStatistics;

/**
 * Created by Mike on 03.02.2016.
 */
public class TupleTest2 {

    static TwoTuple<String, Integer> f() {
        return tuple("hi", 47);
    }

    static TwoTuple f2() {
        return tuple("hi", 47);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return tuple(new Amphibian(), "hi", 47);
    }

    static FourTuple<Vehicle, Amphibian, String, Integer> h() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47);
    }

    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> k() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.1);
    }

    static SixTuple<Vehicle, Amphibian, String, Integer, Double, Float> o() {
        return tuple(new Vehicle(), new Amphibian(), "hi", 47, 11.2, 34.3F);
    }

    static <A, B> void testParameterizedTuple(TwoTuple<A, B> arg) {
        System.out.println(arg);
        int zaglushka = 4;
    }


    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
        System.out.println(o());

        TwoTuple<String, Integer> parameterizedV1 = f();
        TwoTuple unparameterizedV2 = f();
        TwoTuple unparameterizedV3 = f2();

        testParameterizedTuple(parameterizedV1);
        testParameterizedTuple(unparameterizedV2);
        testParameterizedTuple(unparameterizedV3);

        int t = 9;
    }
}
