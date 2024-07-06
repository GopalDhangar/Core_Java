//W.a.p to print all Even numbers from 1 to 100 using while loop

import java.util.Scanner;
class Even_no
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=2;
      while(i<=n)
        {
         if(i%2==0)
         System.out.print(i + " ");
         i++;
        }
    }
 }