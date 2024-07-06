public class StudentClass
{
   public static class Student
       {
       String name;
       int rno;
       double percent;
       }
   public static void main(String ...k)
       {
         Student x=new Student();
         x.name="Raghav";
         x.rno=56;
         x.percent=92.5; 
        System.out.println(x.name);
       System.out.println(x.rno);
       System.out.println(x.percent);

       Student s=new Student();
         s.name="Gopal";
         s.rno=51;
         x.percent=80.5; 
        System.out.println(s.name);
       System.out.println(s.rno);
       System.out.println(s.percent);
       }
}