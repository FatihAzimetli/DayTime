package Collections20Tekrar;

import java.awt.*;
import java.util.*;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        List<String> list2 =new ArrayList<>();
        SortedSet<String> list3 = new TreeSet<>();
        Set<String> list4 = new LinkedHashSet<>();

        List<String> list6= new LinkedList<>();

        list1.add("Ahmat");
        list1.add("Mehmet");
        list1.add("Hulya");
        list1.add("Saniye");
        list1.add("Veli");
        list1.add("Ahmet");
        System.out.println(list1); //Injorser ordum sirali liste karisik verene rejinel order denir
        list1.add(1,"Zafer");//Ahmet ile mehmetin arasina Zafer'i ekliyecegiz
        System.out.println(list1);//[Ahmat, Zafer, Mehmet, Hulya, Saniye, Veli, Ahmet]


    }
}
