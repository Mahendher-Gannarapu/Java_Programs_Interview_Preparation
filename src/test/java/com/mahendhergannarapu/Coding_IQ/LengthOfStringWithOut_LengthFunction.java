package Interview_PreparationApril2025.Coding_IQ;

public class LengthOfStringWithOut_LengthFunction {
    public static void main(String[] args) {

        String name = "Pramod";
        char[] charArray = name.toCharArray();
        int count = 0;
        for (int i = 0; i < charArray.length; i++) {
            count++;
        }
       System.out.println("Length of the string is: " + count);
    }
}