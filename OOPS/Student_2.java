import java. util.*;
class A
   {
     String name;
     int rollNo,m1,m2,m3,sum,average;
     void getdata()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student name: ");
        name=sc.nextLine();
        System.out.println("Enter Student roll no: ");
        rollNo=sc.nextInt();
        System.out.println("Enter subject1 marks: ");
        m1=sc.nextInt();
        System.out.println("Enter subject2 marks: ");
         m2=sc.nextInt();
          System.out.println("Enter subject3 marks: ");
         m3=sc.nextInt();
         sum=m1+m2+m3;
         average=sum/3;
       }
 void disp()
         {
           System.out.println("Student name: "+name);
          System.out.println("Student roll no: "+rollNo);
         System.out.println("Sum: "+sum);
         System.out.println("Average: "+average);
       }
}
class Student_2
   {
     public static void main(String ...k)
      {
       A obj1=new A();
        A obj2=new A();
         A obj3=new A();
       obj1.getdata();   
       obj1.disp();
      obj2.getdata();   
       obj2.disp();
      obj3.getdata();   
       obj3.disp();
       }
}

       
      
     
    
    