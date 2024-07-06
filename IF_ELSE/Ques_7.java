import java.util.Scanner;
class Ques_7
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Physics marks: ");
    int P = sc.nextInt();
    System.out.println("Enter Chemistry marks: ");
    int C = sc.nextInt();
    System.out.println("Enter Biology marks: ");
    int B = sc.nextInt();
    System.out.println("Enter MatheMatics marks: ");
    int M = sc.nextInt();
    System.out.println("Enter Computer marks: ");
    int Cs = sc.nextInt();
    int percentage=((P+C+B+M+Cs)/5);
    if(percentage>=90)
     System.out.println("Grade A");
     else if(percentage>=80)
     System.out.println("Grade B");
     else if(percentage>=70)
     System.out.println("Grade C");
     else if(percentage>=60)
     System.out.println("Grade D");
     else if(percentage>=40)
     System.out.println("Grade E");
     else
     System.out.println("Grade F"); 
   }
}
