package examprac;

import java.io.*;
class equalletters
{
    public static void main()throws IOException
    {
        String S;
        int i,c;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter a String");
        S=br.readLine();
        c=0;
        for (i=0;i<S.length()-1;i++)
        {
            if (S.charAt(i)==S.charAt(i+1))
            {
                c++;
            }
            
        }
        System.out.println(c);
    }
}