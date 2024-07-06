public class Fraction {   // CLASS
    int num;
    int den;

    public static Fraction add(Fraction f1,Fraction f2){
        int numerator=(f1.num*f2.den)+(f2.num*f1.num);
        int  denominator=f1.den*f2.den;
        Fraction f3=new Fraction(numerator,denominator);
        return f3;
    }
    public static int gcd(int num,int den) {  // FUNCTION FOR GCD
        int gcd=1;
        for(int i=2;i<=num && i<=den;i++)
        {
            if(num%i==0 && den%i==0){
                gcd=i;
            }
        }
        return gcd;
    }
    public  Fraction(int num,int den)  // TAKE VALUE OF PARAMETERS
    {
       this.num=num;
       this.den=den;
    }
    public void simplify() {  // SIMPLIFYING/REDUCED FRACTION
        int hcf = gcd(num, den);
        num /= hcf;
        den /= hcf;
    }
}
