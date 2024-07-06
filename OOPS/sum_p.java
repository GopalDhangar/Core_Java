import java.util.*;
class A
{
  int c;
  int  input(int a,int b)
  {
   c=a+b;
   return c;
  }
}
 class sum_p
{
  public static void main(String ...k)
  {
    A obj=new A();
   int r=obj.input(90,80);
  System.out.println("Sum is: "+ r);
   }
}

   