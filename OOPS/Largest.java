class A
{
  int Bigger(int n1,int n2,int n3)
  {
   int  no=(n1>n2)?(n1>n3?n1:n3):(n2>n3?n2:n3);
   return no;
  }
}
class Largest
 {
  public static void main(String ...k)
  {
  int ans= new A().Bigger(80,89,88);
 System.out.println("Bigger No: "+ans);
  }
}
   


   