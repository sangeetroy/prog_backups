
import java.io.*;
public class SUM
{
    public static void main(int n)throws IOException
    { BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
    int s,p,i,j;p=1;s=0;
    for(i=1;i<=n;i++)
    {p=1;
        for(j=1;j<=i+1;j++)
        {
            p=p*j;
            
        }
        s=s+p;
    }
    System.out.println("THE SERIES:"+s);
}
}