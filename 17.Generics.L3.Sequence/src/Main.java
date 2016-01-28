/**
 * Created by user on 28.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        Sequence<String> sequence1 = new Sequence<String>(String.class, 10);
        for(int i = 0; i < 10; i++) {
            sequence1.add("String" + i);
        }
        Selector<String> selector = sequence1.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
    }
}
