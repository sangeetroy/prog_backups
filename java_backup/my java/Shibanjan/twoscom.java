import java.io.*;
class twoscom
{
    public static void main(String arg[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s,s1="",s2="";
        s=br.readLine();
        int i,m=0;
        for(i=s.length()-1;i>0;i--)
        {
            m++;
            s2=s.charAt(i)+s2;
            if(s.charAt(i)=='1')
            break;
        }
        for(i=0;i<s.length()-m;i++)
        {
            if(s.charAt(i)=='1')
            s1=s1+"0";
            else
            s1=s1+"1";
        }
        System.out.println(s1+s2);
    }
}