//W.a.p to calculate product of  digits of a no using while loop

import java.util.Scanner;
class product_of_digits
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r;
      int product=1;
      while(n>=1)
        {
         r=n%10;
         n=n/10;
         product=product*r;
        }
         System.out.println("Product of Digits: "+ product);
    }
 }