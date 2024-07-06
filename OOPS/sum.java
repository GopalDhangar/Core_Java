import java.util.*;
class A
{
  int a,b,c;
  void input()
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter two no's: ");
   a=sc.nextInt();
   b=sc.nextInt();
   c=a+b;
   System.out.println("sum is: "+c);
  }
}
 class sum
{
  public static void main(String ...k)
  {
    A obj=new A();
   obj.input();
   }
}

   