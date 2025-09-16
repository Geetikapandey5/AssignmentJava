import java.util.Scanner;
public class Lpathird {
public static void main(String[] args) {

    int ratee=s.nextInt();
    Projector res=findMaximumPriceByRating(arr, ratee);
    {
       if(res!=null)
       {
        System.out.println(res.getPrice());
       }
       else{
        System.out.println("no");
       }
    }
    public static Projector findMaximumPriceByRating(Projector[] arr, int rate)
    {
        Projector proj=null;
        int pricemax=0;
        for(Projector p:arr)
        {
            if(p.getPrice()>pricemax && p.getRating()>rate && p.getAvailableIn().equalsIgnoreCase("TataCliq"))
           { pricemax=p.getPrice();
            proj=p;
           }
        }
        return proj;
    }

}
}








//=====================

public static Photographer(Photographer[] arr)
{
    int min=Integer.MAX_VALUE;
    Photographer photo=null;
    for(Photographer p:arr)
    {
        if(p.getRating()<min)
        min=p.getRating();
    }
    int second=Integer.MAX_VALUE;
    for(Photographer p1 :arr)
    {
      if( p1.getRating()>min && p1.getRating()<second )
      second=p1.getRating();
    }
    for(Photographer p3:arr)
    {
        if(second==p3.getRating())
        photo=p;
        return photo;
    }
    return null;
}