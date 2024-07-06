//W.a.p to find the reverse of a no using while loop

import java.util.Scanner;
class Reverse
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r; 
      while(n>=1)
        {
         r=n%10;
         n=n/10;
         System.out.print(r);
         }
    }
 }