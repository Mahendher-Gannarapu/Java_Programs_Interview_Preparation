//**Find the Frequency of Each Element in an Array ( Hashmap)**
//Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};
//* O/p 2→ 3 , 3 → 2 , 4→ 2, 5→ 3

package Interview_PreparationApril2025.Coding_IQ.CollectionsIQ;
import java.util.HashMap;
import java.util.Map;
public class FrequencyCount_HashMap_Ex {
        public static void main(String[] args) {
            Integer[] numbers = {2, 2, 3, 4, 5, 5, 5, 3, 2, 4};

            // Create a HashMap to store number -> frequency
            HashMap<Integer, Integer> freqMap = new HashMap<>();

            // Loop through the array
            for (Integer num : numbers) {
                if (freqMap.containsKey(num)) {
                    // Increment count if already present
                    freqMap.put(num, freqMap.get(num) + 1);
                } else {
                    freqMap.put(num, 1); // First time, put count as 1
                }
            }
            // Print the frequency of each element
            for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }


