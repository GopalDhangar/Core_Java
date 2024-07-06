//12345  
//22345  
//33345 
//44445  
//55555

class pattern_24
 {
  public static void main(String args[])
    {
     int i,j,m;
      for(i=1;i<=5;i++)
       {
        for(m=i-1;m>=1;m--)
           {
            System.out.print(i);
           }
        for(j=i;j<=5;j++)
          {
            System.out.print(j);
          }
        System.out.println();
      }
   }
}
       
   