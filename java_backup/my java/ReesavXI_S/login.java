import java.util.*;
class login
{
    int time;
    int date;
    int time1;
    int date1;
        void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter login time");
        time=sc.nextInt();
        System.out.println("enter login date");
        date=sc.nextInt();
        System.out.println("enter login time");
        time1=sc.nextInt();
        System.out.println("enter login date");
        date1=sc.nextInt();
        }
    void clac()
    {
        int t_dif=0,d_dif=0,yyyy=0,mm=0,dd=0,hh=0,min=0,yyyy1=0,mm1=0,dd1=0,hh1=0,min1=0,d=0,m=0,y=0;
        yyyy=date%10000;
        date=date/10000;
        mm=date%100;
        date=date/100;
        dd=date%100;
        date=date/100;
        min=time%100;
        time=time/100;
        hh=time%100;
        time=time/100;
        yyyy1=date1%10000;
        date1=date1/10000;
        mm1=date1%100;
        date1=date1/100;
        dd1=date1%100;
        date1=date1/100;
        min1=time1%100;
        time1=time1/100;
        hh1=time1%100;
        time1=time1/100;
        if(dd1>dd)
        d=dd1-dd;
        else if(dd>dd1)
        d=dd-dd1;
        else
        d=0;
        if(mm1>mm)
        m=mm1-mm;
        else if(mm>mm1)
        m=mm-mm1;
        else
        m=0;
        if(yyyy1>yyyy)
        y=yyyy1-yyyy;
        else if(yyyy>yyyy1)
        y=yyyy-yyyy1;
        else
        y=0;
        if(m<12)
        {
            y=y-1;
            m=12-m;
        }
        System.out.println("years "+y+" months "+m+" days "+d);
        System.out.print("hours"+(hh-hh1)+"minutes"+(mm-mm1));
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        login obj=new login();
        obj.input();
        obj.clac();
    }
}