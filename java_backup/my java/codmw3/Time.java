    import java.util.*;
    public class Time
    {
        int h,m,s;
        Scanner sc=new Scanner(System.in);
        Time(int a,int b,int c)
        {
            h=a;
            m=b;
            s=c;
        }
        void display()
        {
            System.out.println("NET TIME IS "+h+":"+m+":"+s);
        }
        Time toTime(int a)
        {
            Time tem=new Time(0,0,0);
            tem.h=a/3600;
            a=a%3600;
            tem.m=a/60;
            tem.s=a%60;
            tem.h+=tem.m/60;
            tem.m=tem.m%60;
            return tem;
        }
        Time sum(Time ob)
        {
            int hr,mr,sr;
            hr=this.h+ob.h;
            mr=this.m+ob.m;
            sr=this.s+ob.s;
            mr+=sr/60;
            sr=sr%60;
            hr+=mr/60;
            mr=mr%60;
            ob.h=hr;
            ob.m=mr;
            ob.s=sr;
            return ob;
        }
        void main()
        {
            int hr,mn,nm,se;
            
            System.out.println("Enter hours");
            hr=sc.nextInt();
            System.out.println("Enter minutes");
            mn=sc.nextInt();
            System.out.println("Enter seconds");
            se=sc.nextInt();
            System.out.println("Enter five digit number");
            nm=sc.nextInt();
            if(nm>99999 || mn<10000)
            {
                System.out.println("Invalid input");
            }
            else
            {
                Time ob1=new Time(hr,mn,se);
                Time ob2=new Time(0,0,0);
                Time ob3=new Time(0,0,0);
                ob2=ob2.toTime(nm);
                ob1=ob3.sum(ob1);
                ob1.display();
                ob2.display();
                System.out.println("After sum of times");
                ob1=ob1.sum(ob2);
                ob1.display();
            }
        }
    }
    
    