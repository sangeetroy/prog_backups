import java.io.*;
class strin
{
    public static void main(String args[])throws IOException
    
    {
        String s;
        int j,i,k,l,f,f1,sp,p,q;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string:");
        s=br.readLine();
        if(s.length()%2!=0)
        {
            k=(s.length()/2);
            l=(s.length()/2);
        }
        else
        {
             k=(s.length()/2-1);
            l=(s.length()/2-1);
        }
        f=0;
        f1=1;
        sp=15;
        for(i=0;i<s.length();i++)
        {
            p=k;
            q=l;
            for(j=1;j<=sp;j++)
            System.out.print(" ");
            while(p<=q)
            {
                System.out.print(s.charAt(p)+" "+" ");
                p++;
            }
            if(f==0)
            {
                l=l+1;
                f1=0;
                f=1;
            }
            else
            if(f1==0)
            {
                k=k-1;
                f=0;
                f1=1;
            }
            sp=sp-2;
            System.out.println("");
        }
    }
}