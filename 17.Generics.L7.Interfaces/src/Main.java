import generators.*;
import generics.characters.StoryCharacters;
import generics.coffee.Coffee;

/**
 * Created by Mike on 31.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("CoffeeGenerators:");
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++) {
            System.out.println(gen.next());
        }
        for(Coffee c : new CoffeeGenerator(5)) {
            System.out.println(c);
        }

        System.out.println("CoffeeGenerators:");
        CharacterGenerator char_gen= new CharacterGenerator(19);
        for(StoryCharacters sc : char_gen) {
            System.out.println(sc);
        }

        System.out.println("generators.FibonacciGenerator:");
        FibonacciGenerator fibGen = new FibonacciGenerator();
        for (int i = 0; i < 18; i++) {
            System.out.print(fibGen.next() + "; ");
        }

        System.out.println("\ngenerators.IterableFibonacciGenerator:");
        IterableFibonacciGenerator iterFibGen = new IterableFibonacciGenerator(23);
        for(int i : iterFibGen) {
            System.out.print(i + "; ");
        }

        System.out.println("\nComposition generators.IterableFibonacciGenerator");
        CompositionIterableFibonacciGenerator iterComposFibGen = new CompositionIterableFibonacciGenerator(23);
        for(int i : iterComposFibGen) {
            System.out.print(i + "; ");
        }
    }
}
