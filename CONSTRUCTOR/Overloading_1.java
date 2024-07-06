class Student
  {
    String name,stream,course;
    int marks,rollno;
Student()
{
}
Student(String n,String s,String c,int m,int r)
{
name=n;
stream=s;
course=c;
marks=m;
rollno=r;
}
void display()
{
  System.out.println("Name: "+name);
 System.out.println("Stream: "+stream);
  System.out.println("Course: "+course);
  System.out.println("Marks: "+marks);
  System.out.println("Roll No: "+rollno);
}
}
class Overloading_1
{
public static void main(String ...k)
{
Student obj1=new Student();
Student obj2=new Student("Gopal","CSE","Btech",78,51);
obj1.display();
obj2.display();
}
}

