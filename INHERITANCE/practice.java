class A
{
    A(int a)
     {
       System.out.println("value ="+a);
      }
}
class B extends A
 {
   B()
    {
      super(30);
     }
void disp()
   {
      System.out.println("Byee");
    }
}
class practice
{
  public static void main(String ...k)
   {
     B obj=new B();
     obj.disp();
  }
}
    
     
