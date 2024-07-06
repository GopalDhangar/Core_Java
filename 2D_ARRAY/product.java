// WAP that read element in R * C matrix and display product of each row.

import java.util.*;
 class product{
  public static void main(String ...k){
   Scanner ob = new Scanner(System.in);
   System.out.println("Enter size of rows");
   int R = ob.nextInt();
   System.out.println("Enter size of columns");
   int C = ob.nextInt();
   int a[][] = new int[R][C];
   System.out.println("Enter values: ");
   int i,j;
   for(i = 0; i<R; i++)
    {
     for(j=0; j<C; j++)
     {
      a[i][j] = ob.nextInt();
     }
    }
    for(i=0; i<R; i++)
    {
     int p=1;
     for(j=0; j<C; j++)
      {
      p=p*a[i][j];
      }
      System.out.println("product: "+ p);
     }
  }
}
  
  