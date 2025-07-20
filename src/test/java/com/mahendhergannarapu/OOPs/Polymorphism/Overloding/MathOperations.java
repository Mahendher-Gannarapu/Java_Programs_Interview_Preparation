package Interview_PreparationApril2025.OOPs.Polymorphism.Overloding;
//Method Overloading
public class MathOperations {

     int add(int s, int t, int u)
    {
        return s+t+u;
    }

    String add(String a, String b, String c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        System.out.println("Hi");
        return a+b;
    }
}
