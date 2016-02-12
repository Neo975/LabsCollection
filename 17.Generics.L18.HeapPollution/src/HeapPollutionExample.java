import java.util.*;

/**
 * Created by user on 12.02.2016.
 */
public class HeapPollutionExample {
    public static void main(String[] args) {
//        heapPollutionExampleOne();
        heapPollutionExampleTwo();
    }
/*
    public static void heapPollutionExampleOne() {
        List<String> stringListA = new ArrayList<String>();
        List<String> stringListB = new ArrayList<String>();
        ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
        ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
        List<List<String>> listOfStringLists = new ArrayList<List<String>>();
        ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);

        ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
    }
*/
    public static void heapPollutionExampleTwo() {
        Set rawS = new TreeSet<Integer>();
        Set<String> parameterizedS = rawS;
        rawS.add(new Integer(42));
        Iterator<String> iterator = parameterizedS.iterator();
        while(iterator.hasNext()) {
            String string = iterator.next();
            System.out.println(string);
        }
    }
}

