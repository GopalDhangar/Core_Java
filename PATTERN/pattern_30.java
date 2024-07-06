//*
//**
//***
//****
//*****
class pattern_30
{
    public static void main(String ...k)
     {
       int i,j,m;
       for(i=1;i<=5;i++)
       {
       for(m=1;m<=5-i;m++)
        {
       System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
         System.out.print("*");
        }
       System.out.println();
      }
}
}