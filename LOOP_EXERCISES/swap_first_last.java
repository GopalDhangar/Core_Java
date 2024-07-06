import java.util.Scanner;
class swap_first_last
 {
   public static void main(String args[])
   {
    System.out.println("Enter no: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int temp;
    int last=n%10;
    while(n>=10)
     {
       n=n/10;
     }
      System.out.println("first: " + n);
      System.out.println("last: " + last);
      temp=n;
      n=last;
      last=temp;
      System.out.println("first: " + n);
      System.out.println("last: " + last);
   }
}
     
      
