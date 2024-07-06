class A
{
    static int x;
    static int  disp(int a)
     {
      x=a;
      return x;
     }
}
class method_2
{
 public static void main(String ...k)
   {
      int result=A.disp(10);
      System.out.println(result);
  }
}
     