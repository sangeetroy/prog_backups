import java.io.*;
class datecheck
{
    public void main(String args[])
    {
        int dd,mm,yy;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try
        {
            dd=Integer.parseInt(br.readLine());
            mm=Integer.parseInt(br.readLine());
            yy=Integer.parseInt(br.readLine());
            if(yy%4==0||yy%400==0)
            
            System.out.println("leap year");
        
            else
             System.out.println("not leap year");
            
             if(dd<=31)
             
                 System.out.println("valid date");
              else
               System.out.println("invalid date");
            
               if(mm<=12)
               
                System.out.println("valid month");
                else
                 System.out.println("invalid month");
        }
        catch(Exception e){}
        
            
                }
            }
        
        