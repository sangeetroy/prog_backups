import java.io.*;
class D
{
 public static void main(String args[]) throws IOException
 { int totaldays=0,j;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter The Date in dd/mm/yyyy format");
     int dd=Integer.parseInt(br.readLine());
     int mm=Integer.parseInt(br.readLine());
     int yyyy=Integer.parseInt(br.readLine());
     int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
     if(yyyy%4==0 || yyyy%400==0)
     month[2]=29;
     else
     month[2]=28;
     if(mm==2 || dd<1 || dd>month[mm])
     System.out.println("Output:Invalid Date");
     else
     if(dd<1 || dd>31 || mm<1 || mm>12)
     System.out.println("Output :Invalid Date");
     else
     {
         System.out.println("Output:Valid Date");
         for(j=1;j<mm;j++)
         {
             totaldays =totaldays+month[j];
         }
     
     totaldays=totaldays+dd;
     System.out.println("Day Number="+totaldays);
     }
 }
}

