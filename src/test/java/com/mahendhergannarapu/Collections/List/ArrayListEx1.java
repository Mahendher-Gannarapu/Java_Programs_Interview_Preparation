package Interview_PreparationApril2025.Collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

    public static void main(String[] args) {
        List marks=new ArrayList();
        marks.add(99);
        marks.add(95);
        marks.add(93);
        marks.add(92);
        marks.add(91);

        System.out.println(marks);

        //sorting
        Collections.sort(marks);
        System.out.println(marks);
    }
}
