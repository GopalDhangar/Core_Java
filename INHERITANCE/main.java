import java.util.*;
class person
 {
   String name,address,city;
   void getdata()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter  name: ");
       name=sc.nextLine();
       System.out.println("Enter address: ");
       address=sc.nextLine();
       System.out.println("Enter city: ");
       city=sc.nextLine();
    }
    void putdata()
     {
       System. out.println("Name: "+name);
       System. out.println("Address: "+address);
      System. out.println("City: "+city);
     }
}

class student extends person
 {
   int rollno,marks;
  void getdata()
    {
      super.getdata();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter roll no: ");
       rollno=sc.nextInt();
       System.out.println("Enter marks: ");
       marks=sc.nextInt();
      }
    void putdata()
     {
       super.putdata();
       System. out.println("Roll no: "+rollno);
       System. out.println("Marks: "+marks);
     }
}

class employee extends person
 {
   int id,salary;
  void getdata()
    {
      super.getdata();
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter id: ");
       id=sc.nextInt();
       System.out.println("Enter salary: ");
       salary=sc.nextInt();
      }
    void putdata()
     {
       super.putdata();
       System. out.println("Id: "+id);
       System. out.println("Salary: "+salary);
     }
}
class main
  {
    public static void main(String ...k)
     {
       student obj1=new student();
       obj1.getdata();
       obj1.putdata();
      employee obj2=new employee();
       obj2.getdata();
       obj2.putdata();
      }
}