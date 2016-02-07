package generators;

import generators.Generator;

import java.util.*;

/**
 * Created by user on 03.02.2016.
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n) {
        return (List<T>) fill((Collection<T>)coll, gen, n);
    }

    public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n) {
        return (LinkedList<T>) fill((Collection<T>)coll, gen, n);
    }

    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n) {
        return (Queue<T>) fill((Collection<T>)coll, gen, n);
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n) {
        return (Set<T>) fill((Collection<T>)coll, gen, n);
    }
}
