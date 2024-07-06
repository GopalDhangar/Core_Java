class A
{
  static int cube(int a)
   {
     int c=a*a*a;
     return c;
    }
}
class Cube
  {
     public static void main(String ...k)
     {
        int result=A.cube(4);
        System.out.println(result);
      }
}
 