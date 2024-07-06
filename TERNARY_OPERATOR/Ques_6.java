import java.util.Scanner;
class Ques_6
{
  public static void main(String[] k)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter  age: ");
int age=sc.nextInt();
String p=(age>=18)?"Valid Voter":"Not Valid";
System.out.println(p);
}
}
