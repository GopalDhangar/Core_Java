 class A
{
      void disp()
       {
        class B
        {
          void show()
           {
            System.out.println("Show of B");
          }
        }
          B obj=new B();
            obj.show();
   }
}
class nested_1
 {
   public static void main(String ...k)
    {
     A obj=new A();
     obj.disp();
    }
}