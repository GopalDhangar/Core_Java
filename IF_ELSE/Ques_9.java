import java.util.Scanner;
class Ques_9
{
  public static void main(String[] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Electricity Unit");
    int a = sc.nextInt();
    float charges;
    if(a<=50)
      charges=a*0.5f;
    else if(a<=150)
      charges=50*0.5f+(a-50)*0.75f;
    else if(a<=250)
      charges=50*0.5f+100*0.75f+(a-150)*1.2f;
    else
      charges=50*0.5f+100*0.75f+150*1.2f+(a-250)*1.5f;
   float total=charges+charges*0.2f;
System.out.println("Total Bill: "+ total);   
   }
}
