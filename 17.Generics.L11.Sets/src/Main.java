import watercolors.*;
import static watercolors.Watercolors.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(BRILLIANT_RED, VIRIDIAN_HUE);
        Set<Watercolors> set2 = EnumSet.range(CERULEAN_BLUE_HUE, BURNT_UMBER);

        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("union(set1, set2): " + Sets.union(set1, set2));
        System.out.println("intersection(set1, set2): " + Sets.intersection(set1, set2));
        System.out.println("difference(set1, set2): " + Sets.difference(set1, set2));
        System.out.println("difference(set2, set1): " + Sets.difference(set2, set1));
        System.out.println("complement(set1, set2): " + Sets.complement(set1, set2));

        printMethodDifferences();

    }

    public static void printMethodDifferences() {
        System.out.println("\n============= printMethodDifferences() =======================");
        System.out.println("Collection: " + ContainerMethodDifferences.methodSet(Collection.class));
        ContainerMethodDifferences.interfaces(Collection.class);
        ContainerMethodDifferences.difference(Set.class, Collection.class);
        ContainerMethodDifferences.difference(HashSet.class, Set.class);
        ContainerMethodDifferences.difference(LinkedHashSet.class, HashSet.class);
        ContainerMethodDifferences.difference(TreeSet.class, Set.class);
        ContainerMethodDifferences.difference(List.class, Collection.class);
        ContainerMethodDifferences.difference(ArrayList.class, List.class);
        ContainerMethodDifferences.difference(LinkedList.class, List.class);
        ContainerMethodDifferences.difference(Queue.class, Collection.class);
        ContainerMethodDifferences.difference(PriorityQueue.class, Queue.class);
        System.out.println("\nMap: " + ContainerMethodDifferences.methodSet(Map.class));
        ContainerMethodDifferences.difference(HashMap.class, Map.class);
        ContainerMethodDifferences.difference(LinkedHashMap.class, HashMap.class);
        ContainerMethodDifferences.difference(SortedMap.class, Map.class);
        ContainerMethodDifferences.difference(TreeMap.class, Map.class);
    }
}
