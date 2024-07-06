import java.util.Scanner;
class Ques_8
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Basic Salary");
    int a = sc.nextInt();
    float hra,da;
    if(a<=10000)
    {
      hra=a*0.2f;
      da=a*0.8f;
    }
    else if(a<=20000)
    {
      hra=a*0.25f;
      da=a*0.9f;
    }
    else
    {
      hra=a*0.3f;
      da=a*0.95f;
    }
   float total=a+hra+da;
System.out.println("Gross Salary: " + total);   
   }
}
