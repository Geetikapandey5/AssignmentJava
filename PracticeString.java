import java.util.Scanner;
public class PracticeString {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String input=s.nextLine();
     int count=0;
    for(int i=0;i<input.length();i++)
    {
   
    char c=input.charAt(i);
    if(c>='a' && c<='z')
    count++;
    }
    System.out.println("small letters : "+count);
    

}
}