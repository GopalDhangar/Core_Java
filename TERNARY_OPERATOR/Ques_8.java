import java.util.Scanner;
class Ques_8
{
  public static void main(String[] k)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter no: ");
int a=sc.nextInt();
String d=(a>=0)?(a/10==0?"One digit":"More than one digit"):("Negative No");
System.out.println(d);
}
}
