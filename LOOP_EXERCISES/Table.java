//W.a.p to print all Sum of Multiplication table of n using while loop

import java.util.Scanner;
class Table
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=2;
      while(i<=10)
        {
         System.out.println(n*i);
         i++;
        }
    }
 }