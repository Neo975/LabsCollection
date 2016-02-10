import makers.ArrayMaker;

import java.util.Arrays;

/**
 * Created by user on 10.02.2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayMaker<String> stringMaker = new ArrayMaker<String>(String.class);
        String[] stringArray = stringMaker.create(9);

        System.out.println(Arrays.toString(stringArray));
        int t = 9;
    }
}
