interface A
  {
     void show();
   }
 interface B
  {
     void disp();
     void show();
   }
class C implements A,B
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
class Interface_2
  {
    public static void main(String ...k)
      {
        C obj=new C(); 
        obj.disp();
        obj.show();
        obj.go();
      }
  }