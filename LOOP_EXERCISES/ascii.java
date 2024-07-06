class ascii
 {
   public static void main(String args[])
    {
      System.out.println("Ascii characters with their value: ");
      System.out.println(" ");
      for(char i='A';i<='Z';i++)
          {
           int asciiValue=(int) i;
           System.out.print(i+":"+asciiValue+"  ");
          }
      System.out.println(" ");
      System.out.println(" ");
      for(char j='a';j<='z';j++)
        {
         int asciiValue=(int) j;
         System.out.print(j +":"+asciiValue+"  ");
        }
       System.out.println(" ");
       System.out.println(" ");
       for(char k='0';k<='9';k++)
        {
         int asciiValue=(int)k;
         System.out.print(k +":"+asciiValue+"  ");
        }
    }
 }
       