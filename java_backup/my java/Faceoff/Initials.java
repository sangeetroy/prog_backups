import java.io.*;
class Initials
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        String s=br.readLine();
        System.out.print(s.charAt(0)+".");
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            System.out.print(s.charAt(i+1)+".");
        }
    }
}