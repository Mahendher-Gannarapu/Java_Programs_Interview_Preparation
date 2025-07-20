package Interview_PreparationApril2025.Costructors;

public class AHumanEx {
    public static void main (String args[])
    {
        AHuman raju = new AHuman(); //calling DC
        AHuman mahi = new AHuman("Mahi");
        AHuman Srihansh = new AHuman("Srihansh");

        System.out.println(mahi.name);
        System.out.println(Srihansh.name);

    }
}
