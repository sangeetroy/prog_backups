import java.io.*;
public class userchoice
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Nth value");
        int n=Integer.parseInt(br.readLine());
        System.out.println("Enter your choice");
        int ch=Integer.parseInt(br.readLine());
        switch(ch)
        {
            case 1:double s=0;int j=4;
                   for(int i=1;i<=n;i++)
                   {
                       s=s+(double)((double)1/(double)j);
                       j=j+4;
                   }
                   System.out.println("Series1 is"+s);
                   break;
            case 2:double s1=0;int k=1;int f;
                   for(int i=1;i<=n;i++)
                   {
                       f=1;
                       for(int j1=1;j1<=i;j1++)
                         f=f*j1;
                       s1=s1+(double)(((double)1/(double)f)*k);
                       k=k*(-1);
                    }
                   System.out.println("Series2 is"+s1);
                   break;
            default:System.out.println("Invalid Input");
        }
    }
}

        