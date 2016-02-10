import makers.ArrayMaker;

import java.lang.reflect.Array;
import java.util.Arrays;

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
    }

    static void fillArrayContent(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "Item " + i;
        }
    }

}
