import java.io.*;
class numbers
{
    public static void main(String args[])throws IOException
    {
        String S;
        int i, w;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("Enter String");
        S = br.readLine();
        w=1;
        for (i=0; i<S.length(); i++)
        if (S.charAt(i)==' ')
        w++;
        System.out.println("Total word:"+w);
    }
}