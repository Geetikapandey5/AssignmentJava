import java.util.Scanner;

class Bmicheck{
    double weight;
    double height;

    Bmicheck(double weight, double height)
    {
        this.weight=weight;
        this.height=height;
    }

    public void calc()
    {
        double check=weight/((height/100)*(height/100));
        if (check>25){
            System.out.printf("Your bmi is %.2f. You are overweight\n",check);
            System.out.printf("Reduce %.2f kg to be fit", (check-25));
          

        }
       else if(check<18.5)
        {
            System.out.printf("Your bmi is %.2f. You are underweight\n", check);
            System.out.printf("Gain %.2f kg to be fit", (18.5-check));
        }
        else if(check>=18.5 && check<=25)
        {
            System.out.printf("Your bmi is %.2f. You are fit and healthy",check);

        }

    }
}

public class Bmi {
public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.println("Enter weight in kg : ");

    double weight=s.nextDouble();
     System.out.println("Enter height in cm : ");
    double height=s.nextDouble();

    Bmicheck b=new Bmicheck(weight,height);
    b.calc();


}
}