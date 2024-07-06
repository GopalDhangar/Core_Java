// W.A.P that read a string from user and make a new String where first and last character is exchange.

import java.util.*;
class exchangeFirst_last
{
 public static void main(String ...k)
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter a String: ");
 String p=obj.nextLine();
 String r=p.charAt(p.length()-1)+p.substring(1,p.length()-1)+p.charAt(0);
 System.out.println(r);
}
}
