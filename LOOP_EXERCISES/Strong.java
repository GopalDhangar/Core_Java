//W.a.p to find Strong no  using while loop

import java.util.Scanner;
class Strong
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int t=n;
      int s=0;
       while(t>0)
        {
         int r=t%10;
         t=t/10;
         int mul=1;
         int i=r;
         while(i>1)
          {
            mul=mul*i;
            i--;
          }   
         s=s+mul;
        }
         if(s==n)
         System.out.println("strong Number");
         else
         System.out.println("Not strong Number");
      }
 }