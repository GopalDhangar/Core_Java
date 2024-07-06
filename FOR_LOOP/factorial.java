import java.util.Scanner;
class factorial
{ 
  public static void main ( String [] k )
   {
    Scanner ob = new Scanner ( System.in);
    System.out.println ( " enter a no ");
    int f = ob.nextInt();
    for ( int i=f-1 ; i>=1 ; i--)
      {
       f=f*i;
      }
    System.out.println("factorial: "+ f);
   }
}
