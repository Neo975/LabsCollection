import generators.Generator;

import java.util.*;

/**
 * Created by user on 05.02.2016.
 */
public class Main {
    public static void serve(Teller t, Customer c) {
        System.out.println(t + " serves " + c);
    }

    public static void eat(Fish bigFish, Fish littleFish) {
        System.out.println(bigFish + " eats " + littleFish);
    }

    public static void main(String[] args) {
        Random rand = new Random(47);

        System.out.println("======== Customers, tellers ============");
        Queue<Customer> line = new LinkedList<Customer>();
        Generators.fill(line, Customer.generator(), 15);
//        Generators.fill(line, Customer.generator, 15);
        List<Teller> tellers = new ArrayList<Teller>();
        Generators.fill(tellers, Teller.generator, 4);

        for(Customer c : line) {
            serve(tellers.get(rand.nextInt(tellers.size())), c);
        }

        System.out.println("======== Little fishes, big fishes ============");
        Queue<LittleFish> littleFishes = new LinkedList<LittleFish>();
        Generators.fill(littleFishes, LittleFish.generator, 15);

        List<BigFish> bigFishes = new ArrayList<BigFish>();
        Generators.fill(bigFishes, BigFish.generator, 3);

        for(LittleFish littleFish : littleFishes) {
            eat(bigFishes.get(rand.nextInt(bigFishes.size())), littleFish);
        }
    }
}
