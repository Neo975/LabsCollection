import generators.Generator;

/**
 * Created by user on 03.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Generator<String> bg = BasicGenerator.create(String.class);
        bg.next();
        bg.next();
    }
}
