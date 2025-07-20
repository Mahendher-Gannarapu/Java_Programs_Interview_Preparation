package Interview_PreparationApril2025.OOPs.Polymorphism.Overloding;
// Polymorphism- Ability to an object take many forms

//MethodOverloading - same method name but diff arguments/parameters and return type
public class MethodOverloading {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();
        int result= m.add(1,2,3);
        System.out.println(result);
        String name = m.add("mahi","Srini", "Suha");
        System.out.println(name);
        double result1=m.add(3333,4444444);
        System.out.println(result1);


    }
}
