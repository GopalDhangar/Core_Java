class pattern_35
{
    public static void main(String ...k)
     {
       int i,j,m;
       for(i=1;i<=5;i++)
       {
       for(m=1;m<i;m++)
        {
       System.out.print(" ");
        }
        for(j=1;j<=(i*2)-1;j++)
        {
         System.out.print("*");
        }
       System.out.println();
      }
}
}