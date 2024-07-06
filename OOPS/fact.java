class cal
{
 int fact(int a)
 {
  int f=1,i;
  for(i=1; i<=a; i++)
  {
    f = f*i;
  }
  return f;
 }
}
class fact
{
 public static void main(String ...k)
 {
  int b = new cal().fact(5);
  System.out.println("Factorial= "+b);
 }
}