class Sample
{
    String name;
   int marks,rollno;
  Sample(String n,int m,int r)
  {
    name=n;
   marks=m;
   rollno=r;
    }
void display()
  {
    System.out.println("Student name: "+name);
   System.out.println("Marks: "+marks);
  System.out.println("Roll No: "+rollno);
   }
}
class parameterized_1
 {
  public static void main(String ...k)
   {
     Sample obj=new Sample("Gopal",98,51); 
     obj.display();
   }
}
