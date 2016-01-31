package generators;

/**
 * Created by Mike on 31.01.2016.
 */
public class FibonacciGenerator implements Generator<Integer> {
    private int count = 0;

    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if(n < 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }
}
