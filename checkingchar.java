import java.util.Scanner;
public class checkingchar {
    char a;
    public checkingchar(char a)
    {
        this.a=a;

        if(a >='a' && a<='z' && a>='A' && a<='Z')
        {
            System.out.println("this is character");

        }
        else if(a == ! && a==@ && a==# && a==%){
            System.out.println("It is a symbol");

        }
        else{
            System.out.println("it is a number");
        }

    }
public static void main(String[] args) {

    Scanner s=new Scanner(System.in);
    char a=s.next().charAt(0);

    checkingchar c=new checkingchar(a);


}
}