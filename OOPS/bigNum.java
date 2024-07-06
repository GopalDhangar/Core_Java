class cal
{
 int Big(int a, int b, int c)
 { 
  int d=(a>b)?(a>c?a:c):(b>c?b:c);
  return d;
 }
}
class bigNum
{
 public static void main(String ...k)
 {
  int b = new cal().Big(55,43,23);
  System.out.println("Bigger no. is= "+b);
 }
}