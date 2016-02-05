import generators.Generator;

/**
 * Created by user on 05.02.2016.
 */
public class BigFish extends Fish{
    private BigFish() {}

    @Override
    public String toString() {
        return "Big fish " + getId();
    }

    public static Generator<BigFish> generator = new Generator<BigFish>() {
        @Override
        public BigFish next() {
            return new BigFish();
        }
    };
}
