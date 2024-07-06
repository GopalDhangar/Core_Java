import java.util.Scanner;
class Divisor
{ 
  public static void main ( String [] k )
   {
    Scanner ob = new Scanner ( System.in);
    System.out.println ( " enter a no ");
    int no = ob.nextInt();
    for ( int i=1 ; i<=no/2 ; i++)
      {
        if(no%i==0)
         {
          System.out.println("Divisor: "+ i);
         }
      }
   }  
}
