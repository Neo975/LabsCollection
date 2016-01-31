package generics.characters;

/**
 * Created by Mike on 31.01.2016.
 */
public class StoryCharacters {
    private static int counter = 0;
    private final int id = counter++;

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + id;
    }
}
