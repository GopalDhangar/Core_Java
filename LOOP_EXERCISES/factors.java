import java.util.Scanner;
class factors
 {
  public static void main(String args[])
   {
    System.out.println("Enter a no: ");
    Scanner sc=new Scanner(System.in);
    int no=sc.nextInt();
    int i;
    for(i=1;i<no/2;i++)
     {
      if(no%i==0)
      System.out.print(i+" ");
     }
  }
}





    
 