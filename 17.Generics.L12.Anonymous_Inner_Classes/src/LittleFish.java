import generators.Generator;

/**
 * Created by user on 05.02.2016.
 */
public class LittleFish extends Fish{
    private LittleFish() {}

    @Override
    public String toString() {
        return "Little fish " + getId();
    }

    public static Generator<LittleFish> generator = new Generator<LittleFish>() {
        @Override
        public LittleFish next() {
            return new LittleFish();
        }
    };
}
