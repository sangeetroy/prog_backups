package prac_exam;
import java.util.*;
class future_date
{
    int dd;
    int mm;
    int yyyy;
    int days;
    int count;
    future_date()
    {
        count=0;
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter days ");
        dd=sc.nextInt();
        System.out.print("Enter months ");
        mm=sc.nextInt();
        System.out.print("Enter year ");
        yyyy=sc.nextInt();
        System.out.print("Enter no of days to be added ");
        days=sc.nextInt();
    }
    void calc()
    {
        System.out.println("Old Date "+dd+" "+mm+" "+yyyy);
        int yr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        dd=dd+days;
        if(dd>yr[mm-1])
        {
            dd=dd-yr[mm-1];
            mm=mm+1;
            if(mm>12)
            {
                mm=mm-12;
                yyyy=yyyy+1;
            }
        }
        System.out.println("New Date "+dd+" "+mm+" "+yyyy);
    }
    void main()
    {
        accept();
        calc();
    }
}