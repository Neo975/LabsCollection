import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Mike on 06.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        Class class1 = new ArrayList<Integer>().getClass();
        Class class2 = new ArrayList<String>().getClass();
        Class class3 = new LinkedList<Integer>().getClass();

        System.out.println("ArrayList<Integer>.getClass() equals LinkedList<Integer>.getClass() ?: " + (class1 == class3));
        System.out.println("!!! ArrayList<Integer>.getClass() equals ArrayList<String>.getClass() ?: " + (class1 == class2) + " !!!");
        System.out.println("LostInformation: ");
        LostInformation.printInformation();
    }
}
