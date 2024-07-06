class A
 {
   int sum()
      {
       int a=20;
       int b=30;
       int c=a+b;
       return c;
      }
 }
class Np_Rv
 {
     public static void main(String ...k)
       {
        A obj=new A();
        int r=obj.sum();
        System.out.print("sum: ");
        System.out.println(r);
        }
  }