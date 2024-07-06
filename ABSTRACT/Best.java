abstract class A
{
   A()
  {
   System.out.println("Hello Gopal Dhangar:-");
  }
void disp()
 {
   System.out.println("How are U:-");
  }
static void show()
  {
   System.out.println("Fine:-");
  }
 abstract void go();
}
class B extends A
 {
   B()
    {
   System.out.println("Hello Aishwarya:-");
    }
void go()
  {
   System.out.println("good:-");
  }
void display()
  {
   System.out.println("Thank u:-");
  }
}
class Best
{
  public static void main(String ...k)
  {
    B obj=new B();
    obj.disp();
    A.show();
    obj.go();
   obj.display();
  }
}
   