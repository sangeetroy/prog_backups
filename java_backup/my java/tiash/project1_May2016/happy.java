package project1_May2016;

//To check whether a number is happy or not
import java.util.*;
class happy
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int n,n1,s,k=0;
        //input
        System.out.print("Enter value:");
        n=sc.nextInt();
        //checking of the loop
        while(n>=10)
        {
            n1=n;
            s=0;
            while(n1>0)
            {
                k=n1%10;
                s=s+(k*k);
                n1=n1/10;
            }
            n=s;
        }
        if(n==1)
        System.out.print("happy number");
        else
        System.out.print("non-happy number");
    }
}