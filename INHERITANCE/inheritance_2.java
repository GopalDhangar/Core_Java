class A
 {
  void show()
    {
     System.out.println("Hello Gopal: ");
    }
}
class B extends A
  {
    void show()
     {
       super.show();
       System.out.println("Show of B: ");
     }
}
class inheritance_2
  {
    public static void main(String ...k)
     {
       B obj=new B();
       obj.show();
      }
}