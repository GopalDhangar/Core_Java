interface A
  {
     void show();
   }
 interface B extends A
  {
     void disp();
   }
class C implements B
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
class Interface_3
  {
    public static void main(String ...k)
      {
        C obj=new C(); 
        obj.disp();
        obj.show();
        obj.go();
      }
  }