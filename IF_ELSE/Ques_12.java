import java.util.Scanner;
class Ques_12
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    int a = sc.nextInt();
    if(a>10)
        System.out.println("cube: "+ a*a*a);
    else if(a>0)
        System.out.println("Square: " + a*a);
     else
        System.out.println("Negative no"); 
   }
}
