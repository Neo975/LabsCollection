//Цель лабы - показать причину появления дженериков в Java

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list_without_genererics = new ArrayList();
        list_without_genererics.add(new String("test"));
//        Integer v1 = (Integer) list_without_genererics.get(0);

        List<String> list_with_generics = new ArrayList<>();
        list_with_generics.add(new String("test"));
//        Integer v2 = (Integer)list_with_generics.get(0);

        List<Parent> list_parents = new ArrayList<>();
        list_parents.add(new Child());

        int t = 7;
    }
}
