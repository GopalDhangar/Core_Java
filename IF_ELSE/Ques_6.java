import java.util.Scanner;
class Ques_6
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    char a = sc.nextLine().charAt(0);
    if(a>='A' && a<='Z')
        System.out.println("upperCase");
    else if(a>='a' && a<='z')
        System.out.println("Lowercase");
     else
        System.out.println("Not valid"); 
   }
}
