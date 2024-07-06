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
       System. out.println("Show of B: ");
     }
}
class inheritance_3
  {
    public static void main(String ...k)
     {
       B obj=new B();
       obj.show();
      obj.show();
      }
}