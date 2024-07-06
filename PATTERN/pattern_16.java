//    1
//   1 2  
//  1 2 3
// 1 2 3 4  
//1 2 3 4 ss5

class pattern_16
 {
  public static void main(String args[])
    {
     int i,j,m;
     for(i=1;i<=5;i++)
      {
       for(m=4;m>=i;m--)
        {
         System.out.print(" ");
         }
       for(j=1;j<=i;j++)
         {
         System.out.print(j+" ");
         }
       System.out.println();
      }
   }
}
       
   