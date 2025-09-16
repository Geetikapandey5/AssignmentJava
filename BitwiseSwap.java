import java.util.Scanner;

public class BitwiseSwap {

    int a,b;

    void calc()
    {
            System.out.println("after swapping: ");
            a=a^b;
            b=a^b;
            a=a^b;
            System.out.println("a is "+a+ " and b is " +b);
    }
public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the numbers: ");

    int a=s.nextInt();
    int b=s.nextInt();

    BitwiseSwap bs=new BitwiseSwap();
    bs.a=a;
    bs.b=b;
    bs.calc();



}
}