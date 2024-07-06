 class A
{
  static class B
    {
      void disp()
       {
        System.out.println("Disp of B");
       }
    }
}
class nested
 {
   public static void main(String ...k)
    {
     A.B obj=new A.B();
     obj.disp();
    }
}