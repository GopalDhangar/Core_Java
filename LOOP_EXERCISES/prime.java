//W.a.p to find prime factors using while loop

import java.util.Scanner;
class prime
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i,p=0;
      for(i=2;i<=n;i++)
      {
       if(n%i==0)
         {
          p++;
          break;
         }
      }
     if(p==0 && n!=1){
        System.out.println(p+" ");
     }
}
}