import sum_of_digits.*;
import java.util.*;
public class karpraker
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,c,st1,st2,st3,k,m,l1,l2;
        String b="";
        System.out.println("Enter lower limit");
        l1=sc.nextInt();
        System.out.println("Enter upper limit");
        l2=sc.nextInt();
        for(m=l1;m<=l2;m++)
        {
            a=m;
            b=b+(int)(Math.pow(a,2));
            c=b.length();
            if(c%2!=0)
            {
            st1=(int)(Math.pow(a,2)%(Math.pow(10,((c/2)+1))));
            st2=(int)(Math.pow(a,2)/(Math.pow(10,((c/2)+1))));
        }
        else
        {
          st1=(int)(Math.pow(a,2)%(Math.pow(10,(c/2))));
            st2=(int)(Math.pow(a,2)/(Math.pow(10,c/2)));
        }  
            //System.out.println(+st1);
            //System.out.println(+st2);
            dig_sum ob=new dig_sum();
            st3=ob.count(st1,st2);
            //System.out.println(+st3);
            if(st3==a)
            {
              
                System.out.println("Krapraker number"+a);
            }
            b="";
        }
    }
}
        