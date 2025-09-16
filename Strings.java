import java.util.Scanner;
public class Strings {
public static void main(String[] args) {
    
    // String name=s.nextLine();
    // System.out.println(name);
    

    // String n=s.nextLine();
    // String n1=s.nextLine();
    // if(n.equalsIgnoreCase(n1))
    // {
    //     System.out.println("Strings are equal");
    // }
    // else{
    //     System.out.println("not equal");
    // }




    // String n=s.nextLine();
    
    // for(char c: n.toCharArray())
    // {
    //     System.out.println(c);
    // } 



 Scanner s =new Scanner(System.in);
    // String n=s.nextLine();
    // char[] n1=n.toCharArray();
   
    // for(int i=n1.length-1; i>=0; i--)
    // {
    //     System.out.println(n1[i]);
    // }






    // String original=s.nextLine();
    // String rev="";

    // for(int i=original.length()-1; i>=0; i--)
    // {
    //    rev +=original.charAt(i);

    // }
    // if(rev.equalsIgnoreCase(original))
    // {
    //     System.out.println("palindrom");

    // }
    // else{
    //     System.out.println("not");
    // }






    //String input=s.nextLine();
//     int vowel=0;
//     int consonant=0;
//     for(int i=0; i<input.length();i++)
//     {
//         char c=input.charAt(i);
//         if(c>='a' && c<='z')
//         {
//             if(c=='a' || c=='e' || c=='i' ||c=='o' || c=='u')
//             {
//                 vowel++;
//             }
//             else{
//                 consonant++;
//             }
//         }
//     }
//     System.out.println("vowel is: "+vowel+ "consonant is: "+consonant);
 




//  String input=s.nextLine();
// String input1=input.replaceAll("\\s","");

// System.out.println(input1);




// String n=s.nextLine();
// String res="";
// for(int i=0; i<n.length();i++)
// {
//     char c=n.charAt(i);

// if(c=='a' || c=='e' ||c=='i' || c=='o' || c=='u')
// {
//     res += "*";
// }
// else{
//     res +=c;
// }
// }
// System.out.println(res);






// String n=s.nextLine();
// // int count=0;
// // for(int i=0;i<n.length();i++)
// // {
// //     char c=n.charAt(i);
// //     if(c==' ')
// //     count++;
// // }
// // System.out.println(count+1);
// String[] words=n.split("\\s+");
// System.out.println("Words are: "+words.length);





String input = s.nextLine();
        
        // Convert string to char array
        char[] chars = input.toCharArray();
        
        // Create a boolean array to mark counted characters
        boolean[] counted = new boolean[chars.length];

        for(int i = 0; i < chars.length; i++) {
            if (!counted[i]) {
                int count = 1;

                for(int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        count++;
                        counted[j] = true; // Mark as counted
                    }
                }

                // Print character and its frequency
                System.out.println(chars[i] + " - " + count);
            }

}
}
}