class A
 {
   int sum(int a,int b)
      {
       int c=a+b;
       return c;
      }
 }
class P_Rv
 {
     public static void main(String ...k)
       {
        A obj=new A();
        int r=obj.sum(20,40);
        System.out.print("sum: ");
        System.out.println(r);
        }
  }