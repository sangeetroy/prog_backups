import java.io.*;
public class palindrome
{
    public static void main(String args[])throws IOException
    {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,s,max,i,n;s=0;max=0;int n1;
        System.out.println("ENTER TERMS:");
        n=Integer.parseInt(br.readLine());
        n1=n;
        for(i=1;i<=n;i++)
        {
        while(n1>0)
        {a=n1%10;
            s=(s*10)+a;
            n1=n1/10;
        }
    }
        if(s==n1&&n1>max)
        {System.out.println(n1);
        }
    }
}
    

