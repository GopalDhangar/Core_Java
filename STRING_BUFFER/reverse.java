// W.A.P that read a string from user and display reverse of given String.

import java.util.*;
class reverse
{
 public static void main(String ...k)
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter a String: ");
 String p;
 p=obj.nextLine();
 StringBuffer sb=new StringBuffer(p);
 sb.reverse();
 p=sb.toString();
 System.out.println("Reverse= "+p);
}
}
