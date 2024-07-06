import java.util.*;
class delete_vowel
{
  public static void main(String ...k)
   {
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the senetence: ");
    String s=obj.nextLine();
    StringBuffer sb=new StringBuffer(s);
    int i=0;
    int L=sb.length();
  while(i<L)
       {
       char ch=sb.charAt(i);
       if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
        {
        sb.deleteCharAt(i);
        L=L-1;
         }
       else
       {
       i++;
       }
        s=sb.toString();
       } 
       System.out.println(s); 
     }
}
         
    
    