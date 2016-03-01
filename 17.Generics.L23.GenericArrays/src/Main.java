import java.io.*;
import java.util.ArrayList;

/**
 * Created by Mike on 27.02.2016.
 */

class A {}

class B extends A {}

public class Main {
    public static void main(String[] args) {
        ArrayOfGeneric arrayOfGeneric = new ArrayOfGeneric();
//        arrayOfGeneric.f1();
        arrayOfGeneric.f2();

        GenericArrayWithTypeToken<Integer> gai = new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
        Integer[] ia = gai.rep();
    }
}
