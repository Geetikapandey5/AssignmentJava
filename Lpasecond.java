import java.util.Scanner;

import javax.xml.validation.Schema;
import java.math.*;
class Lpasecond {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      HeadSets[] arr=new HeadSets[4];
      for(int i=0;i<4;i++)
      {
    
        String headsetName=s.nextLine();
        String brand=s.nextLine();
    
        int price=s.nextInt();
        
       boolean available=s.nextBoolean();
       s.nextLine();

        arr[i]=new HeadSets(headsetName, brand, price, available);
      }

      String searchBrand=s.nextLine();
      int result=findTotalPriceForGivenBrand(arr, searchBrand);
      {
        if(result>0)
        {
            System.out.println(result);
        }
        else{
            System.out.println("No headset available with the given brand");
        }
      }
      HeadSets res=findAvailableHeadsetWithSecondMinPrice(arr);
      {
        if(res!=null)
        {
            System.out.println(res);
        }
        else{
            System.out.println("no headset available");
        }
      }



    }

    public static int findTotalPriceForGivenBrand(HeadSets[] arr, String brandd)
      {
        int count=0;
        int total=0;
        for(HeadSets h:arr)
        {
            if(h.getBrand().equalsIgnoreCase(brandd))
            {
                total += h.getPrice();
                count++;
            }
        }
        if(count==0) return 0;
        return total/count;
      }
      

      public static HeadSets findAvailableHeadsetWithSecondMinPrice(HeadSets[] arr )
      {
           int total=0;
           int min=Integer.MAX_VALUE;
          
           for(HeadSets h:arr)
           {
            if(h.getAvailable() && min>h.getPrice())
            min=h.getPrice();

           }
           
           
            int second=Integer.MAX_VALUE;
           for(HeadSets h1:arr)
           {
            if(h1.getAvailable() && h1.getPrice()>min && h1.getPrice()<second)
            second=h1.getPrice();
           }
           for(HeadSets h2:arr)
           {
            if(h2.getAvailable() && second==h2.getPrice())
            return h2;
           }
           return null;
      }
}
class HeadSets{
    
    private String headsetName;
    private String brand;
    private int price;
    private boolean available;

    public HeadSets(String headsetName, String brand, int price, boolean available)
    {
        this.headsetName=headsetName;
        this.brand=brand;
      
        this.price=price;
        this.available=available;
    }
    public String getHeadSetName()
    {
        return headsetName;
    }
    public void setHeadSetName(String headsetName)
    {
        this.headsetName=headsetName;
    }
    public String getBrand()
    {
        return brand;
    }
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public int getPrice()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price=price;
    }
    public boolean getAvailable()
    {
        return available;
    }
    public void setAvailable(boolean available)
    {
        this.available=available;
    }
    

}