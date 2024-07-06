//W.a.p to find prime factors using while loop

import java.util.Scanner;
class prime_factors
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=2;
      while(n>1)
        {
          if(n%i==0)
          {
           n=n/i;
           System.out.println(i);
           }
            else
            {
            i++;
            }
       }  
     }
 }