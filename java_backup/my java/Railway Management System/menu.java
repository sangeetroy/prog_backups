import java.io.*;
class menu
{
   
   public static void main(String args[])throws IOException
   {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   int n;
   trainentry1 t=new trainentry1();  
   do
       {
           System.out.println("<<<<MENU>>>>");
           System.out.println("Press 1 for New Train Entry");
           System.out.println("Press 2 for Train Ticket Booking");
           System.out.println("Press 3 for Train Ticket Cancel");
           System.out.println("Press 4 for Total Ticket Sales");
           System.out.println("Press 5 for Total Ticket Cancel");
           System.out.println("Press 6 for Train Report");
           System.out.println("Press 7 for Train Detailed Report");
           System.out.println("Press 8 for Distance from Howrah to other cities");
           System.out.println("Press 9 for Exit");
           System.out.println("Enter Choice:");
           n=Integer.parseInt(br.readLine());
           switch(n)
           {
               case 1:
               t.insert();
      t.show();
               break;
               case 2:
               t.insert1();
      t.show1();
               break;
               case 3:
               t.show2();
               break;
               case 4:
               t.ticsale();
               break;
               case 5:
               t.ticcancel();
               break;
               case 6:
               t.disp_r();
               break;
               case 7:trainfare cr=new trainfare();
               cr.main();
               break;
                case 8:distance d=new distance();
               d.main();
               break; 
               case 9:System.exit(0);
            }
        }while(true);
           
}
}
