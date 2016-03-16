/**
 * Created by user on 16.03.2016.
 */
interface InterfaceOne {}

interface InterfaceTwo {}

class InterfacesImpl implements InterfaceOne, InterfaceTwo {}

public class L24_E25 {
    static <T extends InterfaceOne> void fOne(T item) {}

    static <T extends InterfaceTwo> void fTwo(T item) {}

    public static void main(String[] args) {
        InterfacesImpl object = new InterfacesImpl();
        fOne(object);
        fTwo(object);
    }
}
