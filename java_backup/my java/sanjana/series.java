import java.io.*;
class series
{
    public static void main (int n)throws IOException
    {
        int a, b, c,i;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        a=0;
        b=1;
        System.out.println(a);
        System.out.println(b);
        for (i=1; i<=n-2; i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}

    