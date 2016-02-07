import java.util.*;

/**
 * Created by Mike on 06.02.2016.
 */
class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION, MOMENTUM> {}

public class LostInformation {
    public static void printInformation() {
        List<Frob> list = new ArrayList<Frob>();
        Map<Frob, Fnorkle> map = new HashMap<Frob, Fnorkle>();
        Quark<Fnorkle> quark = new Quark<Fnorkle>();
        Particle<Long, Double> p = new Particle<Long, Double>();

        System.out.println("1) " + list.getClass().getTypeParameters());
        System.out.println("1) " + Arrays.toString(list.getClass().getTypeParameters()));
        System.out.println("2) " + map.getClass().getTypeParameters());
        System.out.println("2) " + Arrays.toString(map.getClass().getTypeParameters()));
        System.out.println("3) " + quark.getClass().getTypeParameters());
        System.out.println("3) " + Arrays.toString(quark.getClass().getTypeParameters()));
        System.out.println("4) " + p.getClass().getTypeParameters());
        System.out.println("4) " + Arrays.toString(p.getClass().getTypeParameters()));
    }
}
