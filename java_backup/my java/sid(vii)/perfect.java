import java.io.*;
public class perfect
{
    public static void main (String ar[])throws IOException
    {
        BufferedReader br=new BufferedReader (
        new InputStreamReader (System.in));
        int n=Integer.parseInt (br.readLine() );
        int i,s=0;
        for (i=1;i<n;i++)
        {
            if (n%i==0)
            s=s+i;
            
        }
        if (s==n)
        System.out.println ("Perfect number");
        else
        System.out.println ("Not a perfect number");
    }
}