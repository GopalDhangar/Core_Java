//1  
//21   
//321 
//4321  
//54321

class pattern_23
 {
  public static void main(String args[])
    {
     int i,j;
      for(i=1;i<=5;i++)
       {
        for(j=1;j<=i;j++)
          {
           if(i%2==1)
            System.out.print("1");
           else
           System.out.print("2");
          }
        System.out.println();
      }
   }
}
       
   