import java.util.*;
class adjacent
{
  public static void main(String args[])
  {
    System.out.println("Enter size: ");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int i;
    System.out.println("Enter the Elements: ");
    for(i=0;i<n;i++)
    {
    a[i]=sc.nextInt();
    }
    for(i=0;i<n-1;i=i+2)
    {
     int t=a[i];
     a[i]=a[i+1];
     a[i+1]=t;
    }
    for(int b:a)
    {
    System.out.println(b);
    }  
     
   }
}


    
    

         
