package Interview_PreparationApril2025.Collections.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("3");
        list.add("3");// ArrayList allowed here duplicates
        //[1, 2, 3, 3, 3]

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(1));//getting false becoz added values are strings
        System.out.println(list.contains("1")); //true becoz both are strings
        System.out.println(list.isEmpty());

        System.out.println("Print all items");
        for(int i=0; i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        System.out.println("----Using for each loop--------");
        //Find all objects in the list those will print
        for(Object o:list) //not worried about index
            System.out.println(o);
    }
}
