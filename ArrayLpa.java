// // Write the main method in the Solution class.
// // In the main method, read an integer value and print "TRUE" if it contains at least 3 odd digits. Else it should print "FALSE".
// // For example, if the value is 123456 and it contains 3 odd digits such as 1,3,5. So it should print "TRUE".
// // The output should be in the format of sample output.
// // Sample input1:
// // 123456
// // Output:
// // TRUE
// import java.util.Scanner;

// class ArrayLpa{
//     public static void main(String args[])
//     {
//         Scanner s=new Scanner(System.in);
//         int n=s.nextInt();
//         int count=0;
//         while(n!=0)
//         {
            
//             int digits=n%10;
//             if(digits%2 !=0)
//              count++;
//              n /=10;
               
//         }
//         if(count>=3)
//         {
//             System.out.println("TRUE");
//     }
//     else{
//         System.out.println("FALSE");
//     }
//     }
// }









//==============================================



// import java.util.Scanner;

//  class ArrayLpa{
//      public static void main(String args[])
//      {
//          Scanner s=new Scanner(System.in);
//          String input=s.nextLine();
//          int count=0;
//          String[] input1=input.split(" ");
//          for(int i=0;i<input1.length;i++)

//          {
//             char ch=input1[i].charAt(0);
//             if(ch=='a' ||ch=='e' || ch=='i' || ch=='o' || ch=='u')
//             count++;

//          }
//          if(count>=1)
//          System.out.println(count);
//          else
//          System.out.println("no vovel");

//         }
//     }


//===================================

import java.util.Scanner;

 class ArrayLpa{
     public static void main(String args[])
     {
         Scanner s=new Scanner(System.in);
         String input=s.nextLine();
         int count=0;
         for(int i=0;i<input.length();i++)
         {
            char c=input.charAt(i);
            if(c>='a' && c<='z')
            count++;
         }
         if(count>=1)
         System.out.println(count);
         else
         System.out.println("no");
     }
    }
