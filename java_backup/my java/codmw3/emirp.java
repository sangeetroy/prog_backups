import java.util.*;
public class emirp
{
    Scanner sc=new Scanner(System.in);
    int a,rev;
    void input()
    {
        System.out.println("Enter the number");
        a=sc.nextInt();
    }
    void reverse()
    {
        int str;
        rev=0;
        str=a;
        while(str>0)
        {
            rev=rev*10+str%10;
            str/=10;
        }
    }
    void check()
    {
        if(a==rev)
        {
            System.out.println("The number is an emirp number");
        }
    }
}