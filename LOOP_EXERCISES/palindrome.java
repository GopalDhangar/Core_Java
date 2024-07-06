//W.a.p to find a no is palindrome or not using while loop

import java.util.Scanner;
class palindrome
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r,s=0;
      int t=n;
      while(n>0)
        {
         r=n%10;
         n=n/10;
         s=s*10+r;
        }   
if(s==t)
System.out.println("Palindrome Number");
else
System.out.println("Not Palindrome Number");
 }
 }