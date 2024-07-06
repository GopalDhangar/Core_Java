import java.util.*;
class perfect
{
  public static void main(String args[])
  {
    System.out.println("Enter size: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    System.out.println("Enter elements: ");
    for(int i=0;i<n;i++)
    {
     a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
     double r=Math.sqrt(a[i]);
     double m=Math.floor(r);
     if(r==m)
     System.out.println("yes");
     else
     System.out.println("not");
    }
  }
}


    
    

         
