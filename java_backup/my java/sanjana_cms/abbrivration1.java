import java.io.*;
class abbrivration1
{
    public static void main () throws IOException
    {
        String S,W;
        int i;
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println ("Enter a String");
        W="";
        S=br.readLine();
        for (i=0;i<S.length();i++)
        {
            if (S.charAt(i)==' ')
            {
                System.out.print (W.charAt(0));
                System.out.print (".");
                W="";
            }
            else
            W=W+S.charAt(i);
        }
        System.out.print (W);
    }
}