import java.io.*;
class PallindromeString
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter string");
        String s=br.readLine();
        int i=0;
        int j=s.length()-1;
        int f=0;
        for (i=0; i<=s.length()/2; i++, j--)
        {
            if (s.charAt(i)!=s.charAt (j))
            {
                f=1;
                break;
            }
        }
        if (f==0)
        System.out.print("Pallindrome: "+s);
        else
            System.out.print("Not pallindrome");
        }
    }

        
        