import java.util.Scanner;
class Ques_9
{
  public static void main(String[] k)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter marks: ");
int marks=sc.nextInt();
String d=marks>=50?"Pass":"Fail";
System.out.println(d);
}
}
