//    *
//   ***  
//  *****
// ******** 
//**********

class pattern_20
 {
  public static void main(String args[])
    {
     int i,j,m,p;
      for(i=1;i<=5;i++)
       {
        for(m=4;m>=i;m--)
          {
            System.out.print(" ");
          }
        for(j=1;j<=i;j++)
          {
            System.out.print("*");
          }
        for(p=i-1;p>=1;p--)
          {
           System.out.print("*");
          }
        System.out.println();
      }
   }
}
       
   