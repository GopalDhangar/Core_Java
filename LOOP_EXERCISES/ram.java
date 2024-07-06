import java.util.Scanner;
class strong_1{
public static void main(String ...k){
Scanner ob = new Scanner(System.in);
int p = ob.nextInt();
int t = p,s=0;
while(t>0){
int r = t%10;
t = t/10;
int f=1;
int i=r;
while(i>0){
f = f*i;
i--;
}
s= s+f;
}
if(s==p){
    System.out.println("strong number");
}
else{
    System.out.println("not");
}
}
}


