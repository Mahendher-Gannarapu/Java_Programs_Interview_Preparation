//**How do you reverse an ArrayList in Java?**
package Interview_PreparationApril2025.Coding_IQ.CollectionsIQ;
import java.util.ArrayList;
import java.util.Collections;
public class Reverse_ArrayList_Ex {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        // Print original list
        System.out.println("Original List: " + list);
        // Reverse the list
        Collections.reverse(list);
        // Print reversed list
        System.out.println("Reversed List: " + list);
    }
}
