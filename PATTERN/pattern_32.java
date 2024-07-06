class pattern_32
{
    public static void main(String ...k)
     {
       int i,m;
       char j,l;
       for(i=0;i<=5;i++)
       {
        for(j='A';j<='F'-i;j++)
        {
         System.out.print(j);
        }
        for(m=1;m<=i*2;m++)
     {
     System.out.print(" ");
}
for(j='E'-i;j>='A';j--)
{
  System.out.print(j);
}
System.out.println(" ");
}
}
}