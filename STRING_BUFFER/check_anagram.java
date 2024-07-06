// W.A.P that read a string from user and check anagram or not.

import java.util.*;
class check_anagram
{
 public static void main(String ...k)
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter First String: ");
 String s1=obj.nextLine();
 System.out.println("Enter Second String: ");
 String s2=obj.nextLine();
 if(s1.length()!=s2.length())
 {
  System.out.println("Not Anagram !");
 }
 else
{
  char a[]=s1.toCharArray();
  char b[]=s2.toCharArray();
  Arrays.sort(a);
  Arrays.sort(b);
  int m=0;
  for(int i=0;i<a.length;i++)
  {
   if(a[i]!=b[i])
   {
   m=1;
   break;
   }
  }
 if(m==0)
 System.out.println("Anagram !");
 else
 System.out.println("not Anagram! ");
}
} 
}
