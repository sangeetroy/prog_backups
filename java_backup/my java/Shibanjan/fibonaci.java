import java.io.*;
class fibonaci
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n,a,b,i;
    void input()throws IOException
    {
        a=0;b=1;i=0;
        n=Integer.parseInt(br.readLine());
        System.out.print(a+","+b);
        fibo(a,b,n,i);
    }
    void fibo(int a,int b,int n,int i)
    {
        if(i>=n-2)
        {
            return;
        }
        else
        {
            System.out.print(a+b+",");
            fibo(b,a+b,n,i+1);
        }
    }
}
            