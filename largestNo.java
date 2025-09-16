import java.util.Scanner;
public class largestNo {
    int a,b,c;
    public class void larger(int a, int b, int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;

        if(a>b && a>c)
        {
            System.out.println("largest number is a: "+a);

        }
        else if(b>a && b>c)
        {
            System.out.println("largest number is b: "+b);
        }
        else{
            System.out.println("largest number is c: "+c);
        }

    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();

    largestNo l=new largestNo();
    l.larger(a, b, c);
}