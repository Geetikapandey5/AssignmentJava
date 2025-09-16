import java.util.Scanner;
public class Shapes {
public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number to perform action 0 to triangle 1");
    String i=s.nextLine();
    if(i.equals("0"))
    {
        System.out.println("Enter radius");
      int radius=s.nextInt();
      double Circlearea=3.14*radius*radius;
      System.out.println("Area of circle is"+Circlearea);

    }
    else if(i.equals("3"))
    {
       System.out.println("Enter base and height of triangle");
       int base=s.nextInt();
       int height=s.nextInt();
       double Trianglearea=0.5*base*height;
       System.out.println("Area of triangle is "+Trianglearea);
    }
    else if(i.equals("4"))
    {
       int length=s.nextInt();
       int breadth=s.nextInt();
       if(length==breadth)
       {
        System.out.println("Area of square is "+length*length);
       }
       else{
        System.out.println("Area of rectangle is "+length*breadth);
       }
    }
    else{
        System.out.println("invalid");
    }
}
}

















