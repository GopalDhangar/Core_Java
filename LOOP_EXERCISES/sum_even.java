//W.a.p to print all Sum of Even no from 1 to n using while loop

import java.util.Scanner;
class sum_even
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int i=2;
      while(i<=n)
        {
         if(i%2==0)
         sum=sum+i;
         i++;
        }
      System.out.println(sum);
    }
 }