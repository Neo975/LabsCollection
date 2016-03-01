/**
 * Created by Mike on 21.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        ClassAsFactory<SimpleClass> classFactoryOne = new ClassAsFactory<>(SimpleClass.class);
        SimpleClass simpleClassObject = classFactoryOne.create(1);
        if(simpleClassObject == null)
            System.out.println("SimpleClass cannot be instantiated!");
        ClassAsFactory<Integer> classFactoryTwo = new ClassAsFactory<>(Integer.class);
        Integer integerObject = classFactoryTwo.create(44);
        if(integerObject == null)
            System.out.println("Integer cannot be instantiated!");
    }
}
