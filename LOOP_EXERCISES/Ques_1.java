//W.a.p to print all natural numbers from 1 to n using while loop

import java.util.Scanner;
class Ques_1
 {
   public static void main(String[] k)
    {
      System.out.println("Enter the No: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int i=1;
      while(i<=n){
         System.out.println("Natural Numbers: "+ i);
         i++;
        }
    }
 }