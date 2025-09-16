import java.util.Scanner;

 class Heightcheck{
    float a;

    Heightcheck(float a)
    {
        this.a=a;
    }
    public void calc()
    {
        double result=(1/30.48)*a;
        System.out.printf("Height in feet is %.2f ", result );
    }

 }


public class Height{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter height in cm : ");
        float a=s.nextFloat();

        Heightcheck h=new Heightcheck(a);
        h.calc();


}
}