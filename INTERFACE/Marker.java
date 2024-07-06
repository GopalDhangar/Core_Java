interface A
{
  int sq(int a);
  int cube(int a);
}
class B implements A
 {
    public int sq(int a)
    {
      return a*a;
    }
    public int cube(int a)
    {
      return a*a*a;
    }
}
class Marker
 {
   public static void main(String ...k)
    {
      B obj=new B();
      int result_1=obj.sq(4);
      int result_2=obj.cube(4);
       System.out.println("Square ="+result_1);
       System.out.println("Cube ="+result_2);
     }
}