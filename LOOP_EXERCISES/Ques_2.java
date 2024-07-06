//W.a.p to print all natural numbers in reverse from n to 1 using while loop

import java.util.Scanner;
class Ques_2
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=n;
      while(i>=1){
         System.out.println("Natural Numbers in Reverse: "+ i);
         i--;
        }
    }
 }