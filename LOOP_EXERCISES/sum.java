//W.a.p to print all Sum of Natural no from 1 to n using while loop

import java.util.Scanner;
class sum
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int sum=0;
      int i=1;
      while(i<=n)
        {
         sum=sum+i;
         i++;
        }
      System.out.println(sum);
    }
 }