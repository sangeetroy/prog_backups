import java.io.*;
public class overload
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        overload abc = new overload();
        System.out.println("ENTER THE STRING::");
        String input = br.readLine();
        System.out.println("ENTER THE CHARACTER::");
        char b = (char)br.read();
        abc.display(input,b);
        System.out.println("ENTER A STRING HAVING ATLEAST THE CHARACTER 'a' AT TWO POSITIONS::");
        System.out.println("");
        String inpu1 = br.readLine();
        System.out.println("ENTER THE DIGIT::");
        int c = Integer.parseInt(br.readLine());
        
        abc.display(inpu1,c);
    }
    public void display(String str, char chr)
    {
        if(chr == 'e')
        {
            for(int i = 0; i < str.length();i+=2)
            {
                if(i == 0)
                {
                    System.out.println(str.charAt(i));
                }
                else
                {
                    System.out.println(","+str.charAt(i));
                }
            }
        }
        else
        {
            for(int i = 1; i < str.length();i+=2)
            {
                if(i == 1)
                {
                    System.out.println(str.charAt(i));
                }
                else
                {
                    System.out.println(","+str.charAt(i));
                }
            }
        }
    }
    public void display(String str,int p)
    {
        if(p == 1)
        {
            for(int i = 0; i < str.length();i++)
            {
                if(str.charAt(i) == 'a')
                {
                    System.out.println("THE FIRST POSITION IS ::"+"  "+(i+1));
                }
                else
                {
                    System.out.println(","+str.charAt(i));
                }
            }
        }
    }
}
