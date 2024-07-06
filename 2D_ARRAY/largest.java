// WAP that read element in R * C matrix and display largest of each row.

import java.util.*;
 class largest{
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
     int largest=0;
     for(j=0; j<C; j++)
      {
      if(a[i][j]>largest)
      largest=a[i][j];
      }
      System.out.println("largest: "+ largest);
     }
  }
}
  
  