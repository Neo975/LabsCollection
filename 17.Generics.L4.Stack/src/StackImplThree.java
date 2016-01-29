/**
 * Created by user on 29.01.2016.
 */

//Not stack, just FIFO queue
public class StackImplThree<T> implements StackInterface<T> {

    private class Node<U> {
        U item;
        Node<U> next_node;
        Node<U> prev_node;

        public Node() {
            item = null;
            next_node = null;
            prev_node = null;
        }

        public Node(U item, Node<U> next_node, Node<U> prev_node) {
            this.item = item;
            this.next_node = next_node;
            this.prev_node = prev_node;
        }

        public boolean isEnd() {
            return prev_node == null;
        }
    }

    private Node<T> stack_top = new Node<T>();
    private Node<T> stack_bottom = stack_top;

    @Override
    public void push(T object) {
        Node<T> new_node = new Node<T>(object, stack_top, null);
        stack_top.prev_node = new_node;
        stack_top = new_node;
    }

    @Override
    public T pop() {
        stack_bottom = stack_bottom.prev_node;
        T value = stack_bottom.item;
        stack_bottom.next_node = null;

        return value;
    }

    @Override
    public T peek() {
        return stack_bottom.prev_node.item;
    }

    @Override
    public boolean isEmpty() {
        return stack_bottom.isEnd();
    }
}
