abstract class A
{
   abstract void disp();
}
class rect extends A
  {
     void disp()
      {
        System.out.println("Hello Gopal: ");
      }
}     
class practice
{
   public static void main(String ...k)
    {
     rect obj=new rect();
    obj.disp();  
     }
}