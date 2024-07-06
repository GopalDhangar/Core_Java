import java.util.Scanner;
public class Ques_2
{
   public static void main(String[] args)
     {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Length: ");
       int length=sc.nextInt();
       System.out.println("Enter Breadth: ");
       int breadth=sc.nextInt();
      System.out.println("Area of Rectangle: "+ length*breadth);
      System.out.println("Perimeter of Rectangle: "+ 2*(length+breadth));
     }
}
