class A
 {
   void sum(int a,int b)
      {
       int c=a+b;
      System.out.print("sum: ");
       System.out.println(c);
      }
 }
class P_Nrv
 {
     public static void main(String ...k)
       {
        A obj=new A();
        obj.sum(20,40);
        }
  }