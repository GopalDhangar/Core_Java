abstract class shape
{
   abstract void area();
}
abstract class vectors extends shape
  {
     abstract void peri();
   }
class rect extends vectors
  {
     void area()
      {
      }
    void peri()
      {
      }
     void show()
      {
      }
}     
class Abstract_3
{
   public static void main(String ...k)
    {
     rect obj=new rect();  
     }
}