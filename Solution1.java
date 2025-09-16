import java.util.Scanner;
public class Solution1 {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);

    public static int countPhotographersBySpecialization(Photographer[] arr, String specialization)
    {
        int count=0;
           for(Photographer p:arr)
           {
            if(p.getSpecialization()==specialization)
            count++;
           }
           return count;
    }
    
    String searchspecialization=s.nextLine();
    int res=countPhotographersBySpecialization(arr, searchspecialization);
    
        if(res>0){
        System.out.println("Number of photographers in specialization "+res);
        }
        else{
            System.out.println("No photographers,,");
        }

    
    public static Photographer getSecondHighest(Photographer[] arr,  )
    {

    }
    

    class Photographer{
    

    }

}
}