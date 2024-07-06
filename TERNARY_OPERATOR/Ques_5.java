import java.util.Scanner;
class Ques_5
{
  public static void main(String[] k)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter  no: ");
int a=sc.nextInt();
String p=(a%5==0)?"Multiple of 5":"Not Multiple of 5";
System.out.println(p);
}
}
