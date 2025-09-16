import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BookSolution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        
        Scanner s=new Scanner(System.in);
        Book[] arr=new Book[4];
        for(int i=0;i<4;i++)
        {
            int id=Integer.parseInt(s.nextLine());
            // s.nextLine();
            String title=s.nextLine();
            String author=s.nextLine();
            double price=Double.parseDouble(s.nextLine());
            // s.nextLine();
            arr[i]=new Book(id, title, author, price);
    }
    Book[] result=sortBooksByPrice(arr);
    for(Book b:arr)
    {
        System.out.println(b.getId()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPrice());
    }   
}
public static Book[] sortBooksByPrice(Book[] arr)
{
    for(int i=0;i<arr.length-1;i++)
    {
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i].getPrice()>arr[j].getPrice())
            {
                Book temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr;
    
}
}


class Book
{
    private int id;
    private String title;
    private String author;
    private double price;
    
    public Book(int id, String title, String author, double price)
    {
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public int getId()
    {return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor()
    {
        return author;
    }
    public double getPrice()
    {
        return price;
    }
    public void setId(int id)
    {
        this.id=id;
        
    }
     public void setTitle(String title)
    {
        this.title=title;
        
    }
     public void setAuthor(String author)
    {
        this.author=author;
        
    }
     public void setPrice(Double price)
    {
        this.price=price;
        
    }
    
}