// WAP that read element in R * C matrix and display sum.

import java.util.*;
 class sum_all{
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
    int sum=0;
    for(i=0;i<R; i++)
    {
     for(j=0; j<C; j++)
      {
      sum=sum+a[i][j];
      }
     }
    System.out.println("sum: "+ sum);
  }
}
  
  