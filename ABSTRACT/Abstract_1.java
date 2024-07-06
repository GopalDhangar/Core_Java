abstract class calc
{
  abstract void sq(int a);
 abstract void cube(int a);
}
class M extends calc
 {
   void sq(int a)
    {
     int b=a*a;
     System.out.println("Square: "+b);
     }
  void cube(int a)
    {
      int b=a*a*a;
       System.out.println("Cube: "+b);
     }
}
class Abstract_1
  {
    public static void main(String ...k)
    {
      M obj=new M();
      obj.sq(4);
      obj.cube(4);
     }
}   