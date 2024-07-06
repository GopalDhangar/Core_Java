import java.util.Scanner;
class Perfect_no
{ 
  public static void main ( String [] k )
   {
    Scanner ob = new Scanner ( System.in);
    System.out.println ( "Enter a No: ");
    int no = ob.nextInt();
    int sum=0;
    for ( int i=1 ; i<=no/2 ; i++)
      {
        if(no%i==0)
          sum=sum+i;
      }
         if(no==sum)
          System.out.println("Perfect No: ");
         else
          System.out.println("Not a Perfect No: ");
   }  
}
