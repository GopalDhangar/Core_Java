import java.util.*;
class A
 {
   int avg(int a,int b,int c)
    {
     int average=(a+b+c)/3;
     return average;
    }
}
class Avg_1
{
  public static void main(String ...k)
  {
   int ans=new A().avg(30,70,89);
   System.out.println("Average: "+ans);
   }
}