import java.io.*;
public class after
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER THE WORD:");
        /**String wrd = br.readLine();
        String newwrd = "";
        int o;
        for(int i= 0; i<wrd.length(); i++)
        {
            o = (int)(wrd.charAt(i));
            newwrd = newwrd + (char)(o+3);
        }
        System.out.println(newwrd);*/double m,n,o;
        for(int i = 1 ; i <= 6750 ; i++ )
        {
            m = (3*i)/50;
            n = (6750-i)/20;
            o = m+n;
            if(o == 280)
            System.out.println(i);
        }
    }
}