import java.util.Scanner;

public class SmallestTernary {
    int a,b,c;

    void calc()
    {
        String result=(a==b && b==c) ? " all are same numbers" :

        (a<b && a<c) ? a + " is smallest" : 
        (b<c) ? b + " is smallest": c + " is smallest";

        System.out.println(result);

    }



public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter numbers: ");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();


    SmallestTernary st=new SmallestTernary();
    st.a=a;
    st.b=b;
    st.c=c;
    st.calc();



}
}