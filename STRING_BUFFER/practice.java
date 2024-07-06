import java.util.*;
class practice{
public static void main(String ...k){
Scanner obj=new Scanner(System.in);
System.out.println("Enter String in Capital letters: ");
String p=obj.nextLine();
StringBuffer sb=new StringBuffer(p);
for(int i=0;i<sb.length();i++)
{
int r=(int)sb.charAt(i);
if(r>=65 && r<=90)
{
r=r+32;
sb.setCharAt(i,(char)r);
}
}
p=sb.toString();
System.out.println(p);
}
}



