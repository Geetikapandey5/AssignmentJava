import java.util.Scanner;

public class Oxygen {
    int a,b,c;

    int calc()
    {
          
          int result=(a*b*10000)/c;
          int result1=(result/10)*10;
          System.out.println("Total number of plants is "+result1);
          double production=result1*0.9;
          System.out.printf("Total oxygen production is %.2f  litres",production);
          
    }

public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the length of the room(in m)");
    int a=s.nextInt();
     if(a<=0){
        System.out.println("invalid length");
           return;
        }
    System.out.println("Enter the breadth of the room(in m)");
    int b=s.nextInt();
    
        if(b<=0){
        System.out.println("invalid breadth");
        return;
        }
    System.out.println("Enter the plant area of a single plant(in cm2)");
    int c=s.nextInt();
     if(c<=0){
        System.out.println("Invalid plant area");
        return;
        }

    Oxygen o =new Oxygen();
    o.a=a;
    o.b=b;
    o.c=c;

    o.calc();
    
}
}