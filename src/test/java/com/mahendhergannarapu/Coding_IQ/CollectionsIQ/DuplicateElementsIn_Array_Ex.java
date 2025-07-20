package Interview_PreparationApril2025.Coding_IQ.CollectionsIQ;
//Find Duplicate elements in Array
public class DuplicateElementsIn_Array_Ex {
          public static void main(String[] args) {
            int[] arr = {4, 2, 7, 2, 4, 9, 5};

            System.out.println("Duplicate elements are:");
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    // Check if elements are equal
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[i]);
                        break; // After finding duplicate, break inner loop
                    }
                }
            }
        }
    }

