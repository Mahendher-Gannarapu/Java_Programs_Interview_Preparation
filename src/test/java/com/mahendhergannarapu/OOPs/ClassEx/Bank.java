package Interview_PreparationApril2025.OOPs.ClassEx;

public class Bank {
    public static void main(String args[])
    {
        BankAccountEx icici = new BankAccountEx();
        System.out.println("Hashcode= " +icici.hashCode());
        icici.balenquiry(3000);
        icici.withDrawMoney();
    }
}
