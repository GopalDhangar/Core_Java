import java.util.*;
class Student
{
  String n,c;
  int m,r;
  void input()
   {
     Scanner obj =new Scanner(System.in);
     System.out.println("Enter Name: ");
         n=obj.nextLine();
      System.out.println("Enter City: ");
         c=obj.nextLine();
     System.out.println("Enter Marks: ");
        m=obj.nextInt();
     System.out.println("Enter Roll no: ");
        r=obj.nextInt();
   }
void disp()
  {
     System.out.println("Name: "+n);
     System.out.println("City: "+c);
     System.out.println("Marks: "+m);
     System.out.println("Roll no: "+r);
   }
}

class T
{
  public static void main(String ...k)
   {
      Student s1=new Student();
      s1.input();
     s1.disp();
   }
}


    