/**
 * Created by user on 28.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        RandomList<Integer> randomList = new RandomList<>();
        for(int i = 0; i < 10; i++) {
            randomList.add(i);
        }
        for(int i = 0; i < 10; i++) {
            System.out.print(randomList.select() + ", ");
        }
        System.out.println();
    }
}
