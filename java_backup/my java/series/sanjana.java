import java.io.*;
 class sanjana
{
    public static void main(int n)throws IOException
    {
        int i, j, S, S1;
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter a number");
        S=0;
        for (i=1;i<=n;i++)
        {
            S1=1;
            for (j=1;j<=i+1;j++)
            S1=S1*j;
            S=S+S1;
        }
        System.out.println(S);
    }
}
        