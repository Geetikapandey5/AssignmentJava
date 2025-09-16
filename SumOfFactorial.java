import java.util.Scanner;
public class SumOfFactorial {
public static void main(String[] args) {
    int num=145;
    int ori=num;
    int sum=0;
    
    while(num!=0)
    {
        int digit=num%10;
        int fact=1;
        for(int i=1; i<=digit;i++)
        fact *=i;
        sum +=fact;
        num /=10;

    }
    if(ori==sum)
    {
        System.out.println("it is strong number"); //145!=1+4!=5!

    }
    

}
}