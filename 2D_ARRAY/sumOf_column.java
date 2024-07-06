// WAP that read element in R * C matrix and sum of each column.

import java.util.*;
 class sumOf_column{
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
    for(j=0;j<C; j++)
    { 
     int sum=0;
     for(i=0; i<R; i++)
      {
      sum=sum+a[i][j];
      }
      System.out.println("sum of each column: "+ sum);
     }
  }
}
  
  