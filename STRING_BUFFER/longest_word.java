// W.A.P that read a string from user and display longest word and length of the longest word.

import java.util.*;
class longest_word
{
 public static void main(String ...k)
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter a String: ");
 String p=obj.nextLine();
 String w[]=p.split(" ");
 String t=w[0];
 int m=w[0].length();
 for(int i=1;i<w.length;i++)
    {
     if(w[i].length()>m)
     {
      m=w[i].length();
      t=w[i];
     }
    }
   System.out.println(m);
   System.out.println(t);     
}
}
