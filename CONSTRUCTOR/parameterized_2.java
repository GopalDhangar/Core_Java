class A
{
 A(int a)
{
 System.out.println("value :"+a);
}
}
class parameterized_2
{
 public static void main(String ...k)
{
  A obj=new A(10);
 }
}