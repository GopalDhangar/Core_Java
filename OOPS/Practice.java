import java.util.*;
class practice{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numerator1 and denominator2:");
        int x= obj.nextInt();
        int y= obj.nextInt();
        Fraction f1=new Fraction(x,y);
        System.out.println(f1.num+"/"+ f1.den);

        System.out.println("Enter the numerator1 and denominator2:");
        int w= obj.nextInt();
        int z= obj.nextInt();
        Fraction f2=new Fraction(w,z);
        System.out.println(f2.num+"/"+ f2.den);
        f1.simplify();
        System.out.println("After Reducing :"+f1.num+"/"+ f1.den);
        f2.simplify();
        System.out.println("After Reducing :"+f2.num+"/"+ f2.den);
        Fraction f3=add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
    }
}