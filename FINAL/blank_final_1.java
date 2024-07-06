class A
{
    final int a;

    // it is applicable only in the constructor

    A(int m)
    {
      a=m;
      System.out.println(a);
     }
}
class blank_final_1
  {
    public static void main(String ...k)
     {
       A obj=new A(4);
      }
}