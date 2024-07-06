//W.a.p to find the sum first and last digit in n using while loop

import java.util.Scanner;
class sum_first_last
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int r=n%10;
      while(n>=10)
        {
         n=n/10;
        }
        sum=n+r;
         System.out.println("Sum: "+ sum);
    }
 }