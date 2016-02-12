/**
 * Created by user on 12.02.2016.
 */
public class MyNode extends Node<Integer> {
    public MyNode(Integer data) {
        super(data);
    }

    @Override
    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}
