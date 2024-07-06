 class A
{
        class B
        {
          void show()
           {
            System.out.println("Show of B");
          }
      }
}
class nested_3
 {
   public static void main(String ...k)
    {
       A ob=new A();
     A.B obj=ob.new B();
     obj.show();
    }
}