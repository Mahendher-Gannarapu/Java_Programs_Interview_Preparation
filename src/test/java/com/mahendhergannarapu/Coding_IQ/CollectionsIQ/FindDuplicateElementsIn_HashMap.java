/*Find duplicate elements*/
package Interview_PreparationApril2025.Coding_IQ.CollectionsIQ;
import java.util.HashMap;
import java.util.Map;
public class FindDuplicateElementsIn_HashMap {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 1, 2};
        // Create a HashMap to store the frequencies of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Calculate the frequencies
        for (int num : numbers) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Print duplicate elements
        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
