import java.util.Scanner;
class Ques_2
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    int a = sc.nextInt();
    if(a%5==0 && a%11==0)
        System.out.println(" Yes,Divisible by 5 and 11");
     else
        System.out.println("not Divisible"); 
   }
}
