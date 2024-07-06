abstract class Calc
{
abstract void sq(int a);
abstract void cube(int a);
}
class m extends Calc
{
 void sq(int a)
 {
  int b=a*a;
  System.out.println("Square:"+b);
 }
void cube(int a)
{
 int b=a*a*a;
System.out.println("cube:"+b);
}
}
class main
{
public static void main(String ...k)
{
  m obj=new m();
  obj.sq(4);
  obj.cube(4);
}
}

