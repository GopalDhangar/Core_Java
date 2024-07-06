import java.util.Scanner;
class Ques_5
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter");
    char a = sc.nextLine().charAt(0);
    if(a>='a'&& a<='z'||a>='A'&& a<='Z')
        System.out.println("Alphabet");
     else if(a>='0' && a<='9')
        System.out.println("Digit");
     else
        System.out.println("Special Character"); 
   }
}
