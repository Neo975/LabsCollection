/**
 * Created by user on 12.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyNode mn = new MyNode(5);
        Node n = mn;
        n.setData("Hello");
        Integer x = mn.data;    //Runtime error: ClassCastException
    }
}
