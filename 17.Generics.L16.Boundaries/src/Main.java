import makers.ArrayMaker;
import makers.ListMaker;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);
//        String[] stringArray = stringMaker.createJava8(9);

        fillArrayContent(stringArray);
        System.out.println(Arrays.toString(stringArray));
        int t = 9;
        testRawTypes();
    }

    static void fillArrayContent(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "Item " + i;
        }
    }

    static void testRawTypes() {
        GenericClass<String> parameterizedType = new GenericClass<String>();
        GenericClass unparameterizedType = new GenericClass();

        unparameterizedType = parameterizedType; //No unchecked conversion warning
        parameterizedType = unparameterizedType; //Warning, unchecked conversion
        parameterizedType.f("String param");     //No warning unchecked call to f()
        unparameterizedType.f("String unparam"); //Warning, unchecked call to f() as member of the raw type GenericClass
        unparameterizedType.f(new Integer(54));  //Warning, unchecked conversion

        GenericClass<Integer> gc = new GenericClass();
    }


    static void testListMaker() {
        ListMaker<String> stringMaker = new ListMaker<String>();
        List<String> stringList = stringMaker.create();
    }

}
