//W.a.p to sum of digits in n using while loop

import java.util.Scanner;
class sum_of_digits
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int r;
      while(n>=1)
        {
         r=n%10;
         n=n/10;
         sum=sum+r;
         }
        System.out.println(sum);
    }
 }