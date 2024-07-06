import java.util.*;
class Kth_Index
 {
    public static void main(String ...args)
    {
     System.out.println("Enter size: ");
     Scanner obj=new Scanner(System.in);
     int n=obj.nextInt();
     int a[]=new int[n];
     System.out.println("Enter elements: ");
     int i;     
     for(i=0;i<n;i++)
      {
       a[i]=obj.nextInt();
      }
     System.out.println("Enter index: ");
     int k=obj.nextInt();

     // new array

     int r=0;
     int b[]=new int[n];
     for(i=k;i<n;i++)
     {
      b[r]=a[i];
      r++;
     }
     for(i=0;i<k;i++)
     {
       b[r]=a[i];
       r++;
     }
     System.out.println("New Array: ");
     for(int m:b)
     {
      System.out.println(m+" ");
     }
 }
}

