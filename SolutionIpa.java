import java.util.Scanner;

import javax.xml.validation.Schema;

class SolutionIpa {
    public static void main(String[] args)
    {
      Scanner s=new Scanner(System.in);
      Resort[] arr=new Resort[4];
      for(int i=0;i<4;i++)
      {
        int resortId=s.nextInt();
        s.nextLine();
        String resortName=s.nextLine();
        String category=s.nextLine();
    
        double price=s.nextDouble();
        double rating=s.nextDouble();
        s.nextLine(); // consume the leftover newline

        arr[i]=new Resort(resortId, resortName, category, price, rating);
      }

      String categ=s.nextLine();
      double result=findAvgPriceByCategory(arr, categ);
      {
        if(result>0)
        {
            System.out.println(result);
        }
        else{
            System.out.println("There are no such available resort");
        }
      }

    }

    public static double findAvgPriceByCategory(Resort[] arr, String cate)
      {
        int count=0;
        int total=0;
        for(Resort r:arr)
        {
            if(r.getCategory().equalsIgnoreCase(cate) && r.getRating()>4)
            {
                total += r.getPrice();
                count++;
            }
        }
        if(count==0) return 0;
        return (double) total/count;
      }
}
class Resort{
    private int resortId;
    private String resortName;
    private String category;
    private double price;
    private double rating;

    public Resort(int resortId, String resortName, String category, double price, double rating)
    {
        this.resortId=resortId;
        this.resortName=resortName;
        this.category=category;
        this.price=price;
        this.rating=rating;
    }
    public int getResortId()
    {
        return resortId;
    }
    public void setResortId(int resortId)
    {
        this.resortId=resortId;
    }
    public String getResortName()
    {
        return resortName;
    }
    public void setResortName(String resortName)
    {
        this.resortName=resortName;
    }
    public String getCategory()
    {
        return category;
    }
    public void setCategory(String category)
    {
        this.category=category;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating=rating;
    }

}