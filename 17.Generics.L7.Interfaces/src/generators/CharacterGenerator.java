package generators;

import generics.characters.BadGuys;
import generics.characters.GoodGuys;
import generics.characters.StoryCharacters;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Mike on 31.01.2016.
 */
public class CharacterGenerator implements Generator<StoryCharacters>, Iterable<StoryCharacters>{
    private Class[] types = {GoodGuys.class, BadGuys.class};
    private static Random rand = new Random(47);
    private int size = 0;

    public CharacterGenerator() {}
    public CharacterGenerator(int size) {
        this.size = size;
    }

    @Override
    public StoryCharacters next() {
        try {
            return (StoryCharacters) types[rand.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<StoryCharacters> iterator() {
        return new Iterator<StoryCharacters>() {
            @Override
            public boolean hasNext() {
                return size > 0;
            }

            @Override
            public StoryCharacters next() {
                size--;
                return CharacterGenerator.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
