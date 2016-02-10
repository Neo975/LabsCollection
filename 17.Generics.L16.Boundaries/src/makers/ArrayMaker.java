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

    @SuppressWarnings("unchecked")
    public T[] create(int size) {
        System.out.println("Kind type name: " + kind.getTypeName());
        System.out.println("Kind type parameters: " + Arrays.toString(kind.getTypeParameters()));
        return (T[]) Array.newInstance(kind, size);
    }
}
