 class A
{
        class B
        {
          void show()
           {
            System.out.println("Show of B");
          }
        }
   void disp()
       {
          B obj=new B();
            obj.show();
   }
}
class nested_2
 {
   public static void main(String ...k)
    {
     A obj=new A();
     obj.disp();
    }
}