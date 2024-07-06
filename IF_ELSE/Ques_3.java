import java.util.Scanner;
class Ques_3
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    char a = sc.nextLine().charAt(0);
    if((a>='A' && a<='Z')||(a>='a' && a<='z'))
        System.out.println("Alphabet");
    else
        System.out.println("not");
   }
}
