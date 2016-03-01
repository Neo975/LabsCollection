import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by Mike on 19.02.2016.
 */
public class ClassAsFactory<T> {
    Class<T> kind;

    public ClassAsFactory(Class<T> kind) {
        try {
            this.kind = kind;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public T create(int arg) {
        T returnValue = null;

        try {
            //Technique 1. Cannot throws exception
            for (Constructor<?> constructor : kind.getConstructors()) {
                if (constructor.getParameterTypes().length == 1) {
                    if (constructor.getParameterTypes()[0] == int.class) {
                        //No unchecked cast warning
                        returnValue = kind.cast(constructor.newInstance(arg));
                        //Unchecked cast warning
                        //returnValue = (T) constructor.newInstance(arg);
                    }
                }
            }
            //Technique 2. Can throws exception
//            returnValue = kind.getConstructor(int.class).newInstance(arg);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return returnValue;
    }
}
