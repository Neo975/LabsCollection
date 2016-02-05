/**
 * Created by user on 05.02.2016.
 */
public class Fish {
    private static long counter = 1;
    private final long id = counter++;

    protected long getId() {
        return id;
    }
}
