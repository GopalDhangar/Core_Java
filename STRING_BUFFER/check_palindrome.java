// W.A.P that read a string from user and check it is palindrome and not.

import java.util.*;
class check_palindrome
{
 public static void main(String ...k)
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter a String: ");
 String p;
 p=obj.nextLine();
 StringBuffer sb=new StringBuffer(p);
 sb.reverse();
 String r =sb.toString();
 if(p.equals(r))
 System.out.println("Palindrome");
 else
 System.out.println("not Palindrome: ");
}
}
