import java.util.*;

/**
 * Created by Mike on 31.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        Byte b = 0x45;
        GenericsMethods gm = new GenericsMethods();

        gm.f("First line classes", "", 1, 1.0);
        gm.f("Second line classes", 1.0F, 'm', b);
        gm.f("Third line classes", gm, gm, gm);

        Map<String, List<String>> sls = New.map();
        List<String> ls = New.list();
        LinkedList<String> lls = New.lList();
        Set<String> ss = New.set();
        Queue<String> queue = New.queue();
    }
}
