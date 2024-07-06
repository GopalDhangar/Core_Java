import java. util.*;
class A
   {
     String Tname;
     int Tno, Noc,Noa,m3,fare;
     void input()
      {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Train name: ");
        Tname=sc.nextLine();
        System.out.println("Enter Train no: ");
        Tno=sc.nextInt();
        System.out.println("Enter No of Children: ");
        Noc=sc.nextInt();
        System.out.println("Enter No of Adults: ");
         Noa=sc.nextInt();
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
class Train
   {
     public static void main(String ...k)
      {
       A obj1=new A();
        A obj2=new A();
         A obj3=new A();
       obj1.input();   
       obj1.disp();
      obj2.input();   
       obj2.disp();
      obj3.input();   
       obj3.disp();
       }
}

       
      
     
    
    