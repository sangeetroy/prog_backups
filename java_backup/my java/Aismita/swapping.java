import java.io.*;
class swapping
{
    public static void main(String s)
    {
        String w=""; String w1="";String w2="";String w3="";
        int i=0;int len=s.length()-1;int p=0;int k=0;
        while(s.charAt(i)!=' ')
        {
            w1=w1+s.charAt(i);
            p=i;
            i++;
        }
        int m=len;
        while(s.charAt(m)!=' ')
        {
        w2=w2+s.charAt(m); 
        k=m;
        m--;
        }
        for(int j=w2.length()-1;j>=0;j--)
        w3=w3+w2.charAt(j);
        
        for(int l=p+1;l<k;l++)
        {
            w=w+s.charAt(l);
        }
        System.out.print(w3+w);//+w1);
        System.out.print(w1);
    }
}