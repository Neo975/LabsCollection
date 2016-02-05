import generators.Generator;

/**
 * Created by user on 05.02.2016.
 */
public class Teller {
    private static long counter = 1;
    private final long id = counter++;
    private Teller() {}

    @Override
    public String toString() {
        return "Teller " + id;
    }

    public static Generator<Teller> generator = new Generator<Teller>() {
        @Override
        public Teller next() {
            return new Teller();
        }
    };
}
