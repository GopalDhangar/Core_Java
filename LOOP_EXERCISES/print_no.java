//W.a.p to find the reverse of a no using while loop

import java.util.Scanner;
class print_no
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int r,s=0; 
      while(n>0)
        {
         r=n%10;
         n=n/10;
         s=s*10+r;
         }
      while(s>0)
       {
        r=s%10;
        s=s/10;
        if(r==0)
          System.out.print("Zero");
        if(r==1)
          System.out.print("One");
        if(r==2)
          System.out.print("Two");
        if(r==3)
          System.out.print("Three");
        if(r==4)
          System.out.print("Four");
        if(r==5)
          System.out.print("Five");
        if(r==6)
          System.out.print("Six");
        if(r==7)
          System.out.print("Seven");
        if(r==8)
          System.out.print("Eight");
        if(r==9)
          System.out.print("Nine");
        }
    
    }
 }