class Sample
{
    int p, qty,a;
  Sample()
  {
    p=10;
    qty=20;
    }
void display()
  {
    a=p*qty;
   System.out.println("Amount: "+a);
   }
}
class parameterized
 {
  public static void main(String ...k)
   {
     Sample obj=new Sample(); 
    obj.display();
   }
}
