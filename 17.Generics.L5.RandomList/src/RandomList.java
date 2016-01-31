import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Mike on 29.01.2016.
 */
public class RandomList<T> {
    private Random rand = new Random(46);
    private List<T> storage = new ArrayList<>();

    public void add(T object) {
        storage.add(object);
    }

    public T select() {
        return storage.get(rand.nextInt(storage.size()));
    }
}
