// W.A.P that reads a string from the user and makes a new String.
// I/P: S1=ABC,S2=XYZW
// O/P: XYCABZW 


import java.util.*;
class newString
{
 public static void main(String ...k)
{
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter first String: ");
 String S1=obj.nextLine();
 System.out.println("Enter second String: ");
 String S2=obj.nextLine();
 System.out.println("new String: ");
 String R=S2.substring(0,2)+S1.charAt(S1.length()-1)+S1.substring(0,2)+S2.substring(2,S2.length());
 System.out.println(R);
}
}
