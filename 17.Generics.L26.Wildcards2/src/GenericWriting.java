import java.util.*;

/**
 * Created by Mike on 26.03.2016.
 */
public class GenericWriting {
    private static List<Apple> apples = new ArrayList<Apple>();
    private static List<Fruit> fruits = new ArrayList<Fruit>();

    private static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    private static <T> void writeExactCollection(List<? super T> destinationList, List<T> sourceList) {
        destinationList.addAll(sourceList);
    }

    public static void f1() {
        writeExact(apples, new Apple());
        writeExact(fruits, new Apple());

        writeExactCollection(fruits, apples);
    }

    public static void f2() {
        List<Apple> la = new ArrayList<Apple>();
        List<Object> lo = new ArrayList<Object>();

        Collections.copy(lo, la);

        //Covariant
        Integer integerValue = null;
        Number numberValue = null;
        numberValue = integerValue;

        Integer[] integerArray = new Integer[12];
        Number[]  numberArray = new Number[12];
        numberArray = integerArray;

        //Contravariant
        List<Integer> integerList = new ArrayList<Integer>();
        List<Number> numberList = new ArrayList<Number>();
//        numberList = integerList;     //Error

    }
}
