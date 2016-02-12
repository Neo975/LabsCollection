import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by user on 12.02.2016.
 */
public class HeapPollutionExample {
    public static void main(String[] args) {
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();
        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
        List<List<String>> listOfStringLists = new ArrayList<List<String>>();
        ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

        ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
    }
}

