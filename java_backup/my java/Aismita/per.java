import java.io.*;
class per
{
    public static void main(String s)throws IOException
    {
        s=s+' ';
        String w="";
        int p=0;double perc=0.0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                perc=0.0;
                p=0;
                for(int j=0;j<w.length();j++)
                {
                    char c=w.charAt(j);
                    if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    p++;
                }
                perc=(p*100)/w.length();
                System.out.println("percentage of vowels="+perc);
                w="";
            }
            else
            w=w+s.charAt(i);
            
        }
    }
}