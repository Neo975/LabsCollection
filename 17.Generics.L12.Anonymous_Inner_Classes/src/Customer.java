import generators.Generator;

/**
 * Created by user on 05.02.2016.
 */
public class Customer {
    private static long counter = 1;
    private final long id = counter++;
    private Customer() {}

    @Override
    public String toString() {
        return "Customer " + id;
    }

    public static Generator<Customer> generator() {
        return new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
    }

/*
    public static Generator<Customer> generator = new Generator<Customer>() {
            @Override
            public Customer next() {
                return new Customer();
            }
        };
*/
}
