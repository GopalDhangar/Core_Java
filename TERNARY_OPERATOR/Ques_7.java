import java.util.Scanner;
class Ques_7
{
  public static void main(String[] k)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter three no: ");
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
int d=(a>b)?(a>c?a:c):(b>c?b:c);
System.out.println("Bigger No is: "+ d);
}
}
