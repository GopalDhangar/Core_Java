class pattern_33
{
    public static void main(String ...k)
     {
       int i,j,m,n;
       for(i=5;i>=1;i--)
       {
       for(m=1;m<=5-i;m++)
        {
       System.out.print(" ");
        }
        for(j=1;j<=(i*2)-1;j++)
        {
         if(j==1 && j==(i*2)-1)
        {
         System.out.print("*");
         }
       else
        {
        System.out.print(" ");
        }
       }
       System.out.println();
      }
}
}
