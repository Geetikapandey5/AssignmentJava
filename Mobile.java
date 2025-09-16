import java.util.Scanner;
public class Mobile {
    static String name;
    public int price;

    public void show()
    {
        System.out.println("name: "+name+ " Price: "+price);
    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    // System.out.println("Enter the name: ");
    // String Name=s.nextLine();
   // System.out.println("Enter the price: ");
    // int Price=s.nextInt();
    Mobile m=new Mobile();
     Mobile m1=new Mobile();
    m.name="iphone";
    m.price=78000;
    m1.price=48000;
    m.show();
    m1.show();
    s.close();



}
}