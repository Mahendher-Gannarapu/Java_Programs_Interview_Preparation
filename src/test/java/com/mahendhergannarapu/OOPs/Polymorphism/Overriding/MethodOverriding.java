package Interview_PreparationApril2025.OOPs.Polymorphism.Overriding;

public class MethodOverriding {
    public static void main(String[] args) {
//        SonEx s = new SonEx();
//        s.home();

//        FatherEx f = new FatherEx();
//        s.home();

        //Dynamic Dispatch
        FatherEx object = new SonEx();
        object.home();

       // Dynamic dispatch
        // WebDriver driver = new ChromeDriver();
    }
}
