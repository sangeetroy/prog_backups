import java.io.*;
public class cross
{
    public static void main()throws IOException
    {
        int a,b,c,x,y,k,l;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter The String");
        String S=br.readLine();
        x=S.length()-2;
        y=S.length()/2;l=y;
        for(a=0;a<S.length();a++)
        {k=a;
            if(k>y)
            {
             k-=l;
            }
            for(b=0;b<=k;b++)
            {
                System.out.print("  ");
            }
            System.out.print(S.charAt(a));
                        if(a>y)
            {
                x+=4;l+=2;
            }
            for(c=x;c>=1;c--)
            {
                System.out.print("  ");
            }
            if(a!=y)
            System.out.print(S.charAt(a));

            if(a<=y)
            {
                x-=2;
            }
           System.out.println("  ");
        }
    }
}