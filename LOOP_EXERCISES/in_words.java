import java.util.Scanner;
class in_words
 {
  public static void main(String args[])
    {
      System.out.println("Enter no: ");
      Scanner sc=new Scanner(System.in);
      int r;
      int no=sc.nextInt();
      for(;no>=1;)
      {
       r=no%10;
       no=no/10;
       String s=Integer.toString(r);
       System.out.println(s);
      }
    }
  }
       