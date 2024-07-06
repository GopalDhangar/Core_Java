interface A
  {
     void disp();
     void show();
   }
class B implements A
   {
     public void disp()
        {
         System.out.println("Hello Gopal:-");
        }
     public void show()
        {
         System.out.println("How are u:-");
        }
      void go()
         {
         System.out.println("Fine:-");
         }
    }
class Interface_1
  {
    public static void main(String ...k)
      {
        B obj=new B(); 
        obj.disp();
        obj.show();
        obj.go();
      }
  }