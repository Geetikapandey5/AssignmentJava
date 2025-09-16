import java.util.Scanner;
public class Solution {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();

    Journalist [] arr=new Journalist[n];
    for(int i=0;i<n;i++){
        id=s.nextInt();
        nextLine();
        name=s.nextLine();
        experience=s.nextInt();
        nextLine();
        region=s.nextLine();
        arr[i]=new Journalist(id,name,experience,region);
    }

    //taking input for method 2
    int searchid=s.nextInt();
    int result=JournalistByld(arr, searchid);

        if(result!=null)
        {
            System.out.println("id- "+getId());
        }
        else{
            System.out.println("no jpornalist fount ");
        }
    
    



    static findAverageExperienceByRegion(arr [], String regionName)
    {
        String regionName=s.nextLine();
        if(regionName==arr[])
        {

        }


    }


    public static JournalistByld(Journalist arr[], int id)
    {
          for(Journalist j: arr)
          {
            if(j.getId()==id)
            return id;
            else return null;
          }
    }




     class Journalist{
        private int id;
        private String name;
        private int experience;
        private String region;

        public Journalist(int id, String name, int experience, String region)
        {
            this.id=id;
            this.name=name;
            this.experience=experience;
            this.region=region;
        }

        public int getId{
            return id;
        }
        public String getName{
            return name;
        }
        public int getExperience{
            return experience;
        }
        public String getRegion{
            return region;
        }
        public void setid(int id)
        {
            this.id=id;
        }
        public void setName(String name)
        {
            this.name=name;
        }
        public void setExperience(int experience)
        {
            this.experience=experience;
        }
        public void setRegion(String region)
        {
            this.region=region;
        }


    }

}
}