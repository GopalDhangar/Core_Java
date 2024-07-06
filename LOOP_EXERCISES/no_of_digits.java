//W.a.p to count no of digits in n using while loop

import java.util.Scanner;
class no_of_digits
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int count=1;
      while(n>=10)
        {
         n=n/10;
         count=++count;
         }
         System.out.println(count);
    }
 }