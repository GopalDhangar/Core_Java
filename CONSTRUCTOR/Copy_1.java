class Student
  {
    String name;
    int m,r;

Student()
{
}

Student(String n,int a,int b)
{
name=n;
m=a;
r=b;
}
Student(Student obj1)
{
name=obj1.name;
m=obj1.m;
r=obj1.r;
}
void display()
{
  System.out.println(name);
  System.out.println(m);
  System.out.println(r);
}
}
class Copy_1
{
public static void main(String ...k)
{
 Student obj1=new Student("Gopal",78,56);
 Student obj2=new Student(obj1);
 Student obj3=new Student(obj1);

obj1.display();
obj2.display();
obj3.display();
}
}

