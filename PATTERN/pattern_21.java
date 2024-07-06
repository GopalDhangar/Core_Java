//*********    
// *******    
//  *****
//   *** 
//    *

class pattern_21
 {
  public static void main(String args[])
    {
     int i,j,m,p;
      for(i=5;i>=1;i--)
       {
        for(m=5-i;m>=1;m--)
          {
            System.out.print(" ");
          }
        for(j=1;j<=i;j++)
          {
            System.out.print("*");
          }
        for(p=1;p<i;p++)
          {
           System.out.print("*");
          }
        System.out.println();
      }
   }
}
       
   