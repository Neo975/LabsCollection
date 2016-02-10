package makers;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by user on 10.02.2016.
 */
public class ArrayMaker<T> {
    private Class<T> kind;

    public ArrayMaker(Class<T> kind) {
        this.kind = kind;
    }

//    @SuppressWarnings("unchecked")
    public T[] create(int size) {
        System.out.println("Kind type name: " + kind.getTypeName());
        System.out.println("Kind type parameters: " + Arrays.toString(kind.getTypeParameters()));
        T[] returnValue = (T[]) Array.newInstance(kind, size);

        return returnValue;
    }

    public T[] createJava8(int size) {
        Object returnValue = null;

        try {
            returnValue = Array.newInstance(Class.forName(kind.getTypeName()), size);

            int t = 9;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return (T[])returnValue;
    }
}
