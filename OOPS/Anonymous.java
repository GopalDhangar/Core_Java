class A
 {
   void sum(int a,int b)
      {
       int c=a+b;
       System.out.println("Sum: "+c);
      }
 }
class Anonymous
 {
     public static void main(String ...k)
       {
        new A().sum(20,40);
        }
  }