package generators;

import java.util.Iterator;

/**
 * Created by Mike on 31.01.2016.
 */
public class CompositionIterableFibonacciGenerator implements Iterable<Integer>{
    private int size;
    private FibonacciGenerator gen = new FibonacciGenerator();

    public CompositionIterableFibonacciGenerator(int count) {
        size = count;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public Integer next() {
                size--;
                return gen.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
