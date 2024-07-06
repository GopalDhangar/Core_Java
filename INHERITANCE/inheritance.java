class A
 {
   int x=10;
  void disp()
    {
     System.out.println("value of x: "+x);
    }
}
class B extends A
  {
    void show()
     {
       System.out.println("Value="+x);
     }
}
class inheritance
  {
    public static void main(String ...k)
     {
       B obj=new B();
       obj.show();
       obj.disp();
      }
}