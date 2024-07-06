import java. util.*;
class A
   {
     String Tname;
     int Tno, Noc,Noa,fare;
     void input(String T,int n,int c,int a)
      {
        Tname=T;
        Tno=n;
        Noc=c;
       Noa=a;
       }
  void calc()
      {
        fare=(Noa*500+Noc*200);
       }
 void disp()
         {
           calc();
           System.out.println("Train name: "+Tname);
          System.out.println("Student roll no: "+Tno);
         System.out.println("No of children: "+Noc);
          System.out.println("No of Adults: "+Noa);
         System.out.println("Fare: "+fare);
       }
}
class Pa_Nrv
   {
     public static void main(String ...k)
      {
       A obj=new A();
       obj.input("gopal",23,50,50);   
       obj.disp();
      }
}