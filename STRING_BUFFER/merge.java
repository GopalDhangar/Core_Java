//Wap that reads String and make a new String according to
//i/p: manoj  ram
//o/p: mraanmoj

import java.util.*;
class merge
 {
  public static void main(String ...k)
   {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the Two strings: ");
    String s1=obj.nextLine();
    String s2=obj.nextLine();
    StringBuffer sb=new StringBuffer();
    for(int i=0;i<s1.length()||i<s2.length();i++)
      {
        if(i<s1.length())
         sb.append(s1.charAt(i));
        if(i<s2.length())
        sb.append(s2.charAt(i));
      }
     System.out.println(sb);      
  }
}
         
    
    
