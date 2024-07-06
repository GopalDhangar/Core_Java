class Student
  {
    String name;
    int m,r;
Student()
{
}
Student(String n)
{
name=n;
}
Student (int a,int b)
{
m=a;
r=b;
}
Student(String n,int a,int b)
{
name=n;
m=a;
r=b;
}
void display()
{
  System.out.println(name);
  System.out.println(m);
  System.out.println(r);
}
}
class Overloading
{
public static void main(String ...k)
{
 Student obj=new Student();
 Student obj1=new Student("Gopal");
Student obj2=new Student(89,89);
Student obj3=new Student("Gopal",78,56);
obj.display();
obj1.display();
obj2.display();
obj3.display();
}
}

