class A
{
   int input(int n)
    {
      int sum=0;
     while(n>=1)
     {
      int r=n%10;
      n=n/10;
      sum=sum+r;
     }
      return sum;
    }
}
 class Sum_digit
{
 public static void main(String ...k)
   {
     int s=new A().input(4567);
     System.out.println(s);
   }
}
     
     