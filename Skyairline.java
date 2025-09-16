import java.util.Scanner;

class Skyairline
{
   String name;
   String source;
   String destination;
   
   void print()
   {
    System.out.println("Dear" + name + ", welcome onboard with service from " + source + " to " + destination + ". Thank you for choosing sky airlines. Enjoy your flight.");

   }



public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter name");
    String name=scanner.nextLine();

    System.out.println("Enter source");
    String source=scanner.nextLine();

    System.out.println("Enter destination");
    String destination=scanner.nextLine();

    Skyairline s=new Skyairline();
    s.name=name;
    s.source=source;
    s.destination=destination;

    s.print();


}
}
