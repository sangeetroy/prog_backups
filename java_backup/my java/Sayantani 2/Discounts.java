import java.util.*;
  class Discounts
{
     
   
   Scanner sc= new Scanner(System.in);
int n,dis;  
  Discounts()
   {
System.out.println("Enter data:");         
n=sc.nextInt();
          cal(n);
}
         void cal(int n)
{
dis=0;
  if (n<= 10000)
   dis=((n*10)/100);
  else
   if (n>10000 && n<=25000)
   dis=((n*15)/100);
  else
   if(n>25000 && n<=50000)
   dis=((n*25)/100);
  else
   if(n>50000)
   dis=((n*35)/100);
   System.out.println("Thanks for purchasing");
   System.out.println("Discount amount is:"+dis);
}
   public static void main(String[]args)
{
   Discounts D= new Discounts();
}
}