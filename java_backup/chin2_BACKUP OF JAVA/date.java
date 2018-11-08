import java.io.*;
public class date
{
    boolean b;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("ENTER THE NUMBER::");
        int input = Integer.parseInt(br.readLine());
        date abc = new date();
        if(input%10000 == 0)
            System.out.println("!!WRONG CHOICE!!");
        else
            abc.calculate(input);
    }
    public void calculate(int input)
    {
        int days = input/10000;
        int year = input%10000;
        do
        {
            if(year%100 == 0)
            {
                if(year%400 == 0)
                { b = leap(days,year);days = days - 366;}
                else
                { b = nonleap(days,year);days = days - 365;}
            }
            else if(year%4 == 0)
            { b = leap(days,year);days = days - 366;}
            else
            { b = nonleap(days,year);days = days - 365;}
            year++;
        }while(b == true);
    }
    public boolean nonleap(int days,int year)
    {
        if((days>0)&&(days<=31))
         System.out.println("JANUARY "+days+" , "+year);
        
        else if((days>31)&&(days<=59))
         System.out.println("FEBRUARY "+(days-31)+" , "+year);
        
        else if((days>59)&&(days<=90))
         System.out.println("MARCH "+(days-59)+" , "+year);
        
        else if((days>90)&&(days<=120))
         System.out.println("APRIL "+(days-90)+" , "+year);
        
        else if((days>120)&&(days<=151))
         System.out.println("MAY "+(days-120)+" , "+year);
        
        else if((days>151)&&(days<=181))
         System.out.println("JUNE "+(days-151)+" , "+year);
        
        else if((days>181)&&(days<=212))
         System.out.println("JULY "+(days-181)+" , "+year);
        
        else if((days>212)&&(days<=243))
         System.out.println("AUGUST "+(days-212)+" , "+year);
        
        else if((days>243)&&(days<=273))
         System.out.println("SEPTEMBER "+(days-243)+" , "+year);
        
        else if((days>273)&&(days<=304))
         System.out.println("OCTOBER "+(days-273)+" , "+year);
        
        else if((days>304)&&(days<=334))
         System.out.println("NOVEMBER "+(days-304)+" , "+year);
        
        else if((days>334)&&(days<=365))
         System.out.println("DECEMBER "+(days-334)+" , "+year);
        
        else
        return true;
        return false;
    }
    public boolean leap(int days,int year)
    {
        if((days>0)&&(days<=31))
         System.out.println("JANUARY "+days+" , "+year);
        else if((days>31)&&(days<=60))
         System.out.println("FEBRUARY "+(days-31)+" , "+year);
        else if((days>60)&&(days<=91))
         System.out.println("MARCH "+(days-60)+" , "+year);
        else if((days>91)&&(days<=121))
         System.out.println("APRIL "+(days-91)+" , "+year);
        else if((days>121)&&(days<=152))
         System.out.println("MAY "+(days-121)+" , "+year);
        else if((days>152)&&(days<=182))
         System.out.println("JUNE "+(days-152)+" , "+year);
        else if((days>182)&&(days<=213))
         System.out.println("JULY "+(days-182)+" , "+year);
        else if((days>213)&&(days<=244))
         System.out.println("AUGUST "+(days-213)+" , "+year);
        else if((days>244)&&(days<=274))
         System.out.println("SEPTEMBER "+(days-244)+" , "+year);
        else if((days>274)&&(days<=305))
         System.out.println("OCTOBER "+(days-274)+" , "+year);
        else if((days>305)&&(days<=335))
         System.out.println("NOVEMBER "+(days-305)+" , "+year);
        else if((days>335)&&(days<=366))
         System.out.println("DECEMBER "+(days-335)+" , "+year);
        else
         return true;
        return false;
    }
}