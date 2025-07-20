package Interview_PreparationApril2025.OOPs.Encapsulation;

public class FaceBookRunner {
    public static void main(String[] args) {
        FaceBookLogin f = new FaceBookLogin("mhendher", "1234");
        System.out.println(f.password);

        f.password = "hacker";
        System.out.println(f.password );
    }
}
