//W.a.p to find the first and last digit in n using while loop

import java.util.Scanner;
class First_Last
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r=n%10;
      while(n>=10)
        {
         n=n/10;
         }
         System.out.println("first: "+ n);
         System.out.println("last: "+ r);
    }
 }