import java.util.Scanner;
class Ques_4
{
  public static void main(String[] k)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter  no: ");
int a=sc.nextInt();
String p=(a%2==0)?"Even":"Odd";
System.out.println(p);
}
}
