import java.util.Scanner;
public class TotalNoOFZero {
public static void main(String[] args) {
    int num=1008;
    int count=0;
    while(num !=0)
    {
        int digit= num%10;
        if(digit==0)
        count++;
        num /=10;
    }
    System.out.println("no of zeros is: "+count);

}
}