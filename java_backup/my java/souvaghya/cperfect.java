import java.io.*;
class cperfect
{
    int n,k;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    cperfect()
    {
        n=0;
    }
    void input()throws IOException
    {
        n=Integer.parseInt(br.readLine());
        System.out.print("Enter value:");
        k=check(n);
        if(k==1)
        System.out.println("Perfect....");
        else
        System.out.println("Not Perfect.....");
    }
    int check(int a)
    {
        int d,b;
        b=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            b=b+i;
        }
        if(b==n)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])throws IOException
    {
                  
        
        cperfect a=new cperfect();
        a.input();
    }
}

        
