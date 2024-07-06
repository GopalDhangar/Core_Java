//12345
// 1234    
//  123  
//   12 
//    1

class pattern_19
 {
  public static void main(String args[])
    {
     int i,j,m;
      for(i=5;i>=1;i--)
       {
        for(m=5-i;m>=1;m--)
          {
            System.out.print(" ");
          }
        for(j=1;j<=i;j++)
          {
            System.out.print(j);
          }
        System.out.println();
      }
   }
}
       
   