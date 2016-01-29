/**
 * Created by user on 29.01.2016.
 */
public class Main {
    public static void main(String[] args) {
//        StackInterface<Integer> stack = new StackImplOne<Integer>();
//        StackInterface<Integer> stack = new StackImplTwo<Integer>();
        StackInterface<Integer> stack = new StackImplThree<Integer>();
        for(int i = 0; i < 93; i++) {
            stack.push(i);
        }
        System.out.println(stack.peek());
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + "; ");
        }
    }
}
