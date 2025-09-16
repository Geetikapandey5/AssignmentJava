import java.util.Scanner;
public class Square {
    int length,breadth;
    public Square(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
        if(length==breadth)
        {
            System.out.println("It is square");

        }
        else{
        System.out.println("Rectangle");
        }
    }
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int length=s.nextInt();
    int breadth=s.nextInt();
    Square sq=new Square(length,breadth);

}
}