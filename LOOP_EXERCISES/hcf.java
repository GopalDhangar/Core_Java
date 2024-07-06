import java.util.Scanner;
class hcf
 {
  public static void main(String args[])
   {
    System.out.println("Enter two no: ");
    Scanner sc=new Scanner(System.in);
    int fno=sc.nextInt();
    int sno=sc.nextInt();
    int i;
    int hcf=1;
    for(i=2;i<=fno && i<=sno;i++)
     {
      if(fno%i==0 && sno%i==0)
      {
       hcf=i;
      }
     }
    System.out.println(hcf);
  }
}





    
 