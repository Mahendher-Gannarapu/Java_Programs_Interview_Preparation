package Interview_PreparationApril2025.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_SortingEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Mahi");
        list.add("Raju");
        list.add("Kumar");
        list.add("Srihansh");
        list.add("Suhanth");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("Mahi"));

        System.out.println("---Sorting----");
        for(Object o:list)
        {
            System.out.println(o);
        }

        for(int i=0; i<list.size(); i++)
        {
            System.out.println(list.get(i));
        }

    }
}
