import java.util.Scanner;
class Ques_11
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number: ");
    int a=sc.nextInt();
   if(a>=0)
   {
    if(a<=9)
   System.out.println("One Digit: ");
  else if(a<=99)
   System.out.println("Two Digit: ");
  else if(a<==999)
   System.out.println("Three Digit: ");
  }
 }
}
