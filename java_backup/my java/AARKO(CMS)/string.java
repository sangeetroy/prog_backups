import java.io.*;
class string
{
    public static void main()throws IOException
    {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);
        String s,s1[],w;
        int t=0,i,j,k,n;
        
            System.out.print("Enter the paragraph : ");
            s=br.readLine();
            s=s.toUpperCase();
        s1=new String[100];
        w="";
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.'||s.charAt(i)==','||s.charAt(i)=='!'||s.charAt(i)=='?') 
            {
                s1[t++]=w;
                w="";
            }
            else 
            w=w+s.charAt(i);
        }
        s1[t++]=w;
        for(i=0;i<t-1;i++)
        {
        for(j=i+1;j<t;j++)
        {
        if(s1[i].compareTo(s1[j])>0)
        {
            w=s1[i];
            s1[i]=s1[j];
            s1[j]=w;
        }
    }
}
        for(i=0;i<t;i++)
        System.out.println(s1[i]);
        for(i=0;i<t;i++)
        {
            System.out.println(s1[i]);
            if(s1[i].charAt(0)=='A'||s1[i].charAt(0)=='E'||s1[i].charAt(0)=='I'||s1[i].charAt(0)=='O'||s1[i].charAt(0)=='U')
            System.out.println(s1[i]);
        }
    }
}
         
            