package project;

import java.io.*;
class dowhilefact
{
    int i,f,n;
    void input(int x)
    {
        n=x;
    }
    void cal()
    {
        f=1;
        i=1;
        do
        {
            f=f*i;
            i++;
        }
        while(i<=n);
        System.out.println("Factorial"+f);
    }
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value");
        n=Integer.parseInt(br.readLine());
        dowhilefact f1=new dowhilefact();
        f1.input(n);
        f1.cal();
    }
}