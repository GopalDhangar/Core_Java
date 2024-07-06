class A
 {
  void disp()
    {
     System.out.println("Display of A: ");
    }
}
class B extends A
  {
    void show()
     {
       disp();
       System.out.println("Show of B: ");
     }
}
class inheritance_1
  {
    public static void main(String ...k)
     {
       B obj=new B();
       obj.show();
      }
}