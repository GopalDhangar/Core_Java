// WAP that read element in R * C matrix1 and r*c matrix 2 display product of two matrix.

import java.util.*;
 class productOf_twoMatrix
{
  public static void main(String ...k)
{  
   int i,j;
   Scanner ob = new Scanner(System.in);
     
          // Matrix:1
  
   System.out.println("Matrix 1: ");
   System.out.println("Enter size of rows: ");
   int R = ob.nextInt();
   System.out.println("Enter size of columns: ");
   int C = ob.nextInt();
   int a[][] = new int[R][C];
   System.out.println("Enter values: ");
   for(i = 0; i<R; i++)
    {
     for(j=0; j<C; j++)
     {
      a[i][j] = ob.nextInt();
     }
    }
   
    // matrix 2

    System.out.println("Matrix 2: ");
    System.out.println("Enter size of rows: ");
   int r = ob.nextInt();
   System.out.println("Enter size of columns: ");
   int c = ob.nextInt();
   int b[][] = new int[r][c];
   System.out.println("Enter values: ");
   for(j=0; j<c; j++)
    {
     for(i=0; i<r; i++)
     {
      b[i][j] = ob.nextInt();
     }
   }

     // matrix sum
    
    for(i=0;i<R;i++)
     {
      for(j=0;j<C;j++)
       { 
        int product=1;
    for(j=0;j<c;j++)
       {
       for(i=0;i<r;i++)
         {
        product=product*a[i][j]*b[i][j];
         }
       }
  System.out.println("product: "+ product);
      }
    }  
  }
}
  
  