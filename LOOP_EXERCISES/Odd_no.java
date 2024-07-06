//W.a.p to print all Odd numbers from 1 to 100 using while loop

import java.util.Scanner;
class Odd_no
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      while(i<=n)
        {
         if(i%2!=0)
         System.out.print(i + " ");
         i++;
        }
    }
 }