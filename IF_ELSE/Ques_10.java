import java.util.Scanner;
class Ques_10
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    int a=sc.nextInt();
    int b=sc.nextInt();
    System.out.println("Enter your Choice: ");
    int choice=sc.nextInt();
  if(choice==1)
   System.out.println(a+b);
  else if(choice==2)
   System.out.println(a-b);
  else if(choice==3)
   System.out.println(a*b);
   else if(choice==4)
   System.out.println(a/b);
   else
   System.out.println("Wrong Choice: ");
 }
}
