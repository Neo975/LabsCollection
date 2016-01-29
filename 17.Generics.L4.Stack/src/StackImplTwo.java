/**
 * Created by user on 29.01.2016.
 */
//LIFO
public class StackImplTwo<T> implements StackInterface<T> {

    private class Node<U> {
        U item;
        Node<U> next_node;

        public Node() {
            item = null;
            next_node = null;
        }

        public Node(U item, Node<U> next_node) {
            this.item = item;
            this.next_node = next_node;
        }

        public boolean isEnd() {
            return (item == null) && (next_node == null);
        }
    }

    private Node<T> stack_top = new Node<T>();

    @Override
    public void push(T object) {
        stack_top = new Node<T>(object, stack_top);
    }

    @Override
    public T pop() {
        T object = stack_top.item;
        if(!stack_top.isEnd()) {
            stack_top = stack_top.next_node;
        }
        return object;
    }

    @Override
    public T peek() {
        return stack_top.item;
    }

    @Override
    public boolean isEmpty() {
        return stack_top.isEnd();
    }
}
