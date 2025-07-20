package Interview_PreparationApril2025.Costructors;

public class AHuman {
    String name;
    int id;
    long adhaarnumber;

    //Default constructor
    AHuman()
    {
        System.out.println("Hi I am DC calling when object is created");
    }


    //Parameterized constructor
    AHuman(String name)
    {
        System.out.println("Hi I am PC");
        this.name=name;
    }
}

