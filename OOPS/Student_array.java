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

class Student_array
{
  public static void main(String ...k)
   {
      Scanner obj=new Scanner(System.in);
      int n;
     System.out.println("Enter no of Student: ");
     n=obj.nextInt();

      Student s[]=new Student[n];
       int i;
      for(i=0;i<n;i++)
       {
        s[i]=new Student();
      s[i].input();
      }
      for(i=0;i<n;i++)
       {
         s[i].disp();
       }
   }
}


    