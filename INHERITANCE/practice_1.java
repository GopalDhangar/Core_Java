class A
{
    A(int a)
     {
       System.out.println("value ="+a);
      }
}
class B extends A
 {
   B(int x)
    {
      super(x);
      System.out.println("value="+x);
    }
}
class practice_1
{
  public static void main(String ...k)
   {
     B obj=new B(40);
  }
}
    
     
