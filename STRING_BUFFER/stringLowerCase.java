// WAP to change the given string in lowercase without using to LowerCase method?

import java.util.*;
 class stringLowerCase
 {
  public static void main(String ...k)
  {
   Scanner ob = new Scanner(System.in);
   System.out.println("Enter the String");
   String p = ob.nextLine();
StringBuffer sb = new StringBuffer(p);
for(int i=0;i<sb.length();i++)
{
int r=(int)sb.charAt(i);
if(r>=65 && r<=90)
{
r=r+32;
sb.setCharAt(i,(char)r);
}
}
p=sb.toString();
System.out.println(p);
}
}
 
       
   
   