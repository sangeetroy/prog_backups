import java.io.*;
public class special
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
        System.out.println("ENTER THE NUMBER ::");
        int input = Integer.parseInt(br.readLine());
        if(input/10 == 0)
        {
            System.out.println("WRONG INPUT");
        }
        else
        {
            int last = input%10;
            int first = input;
            while(first/10 != 0)
            {
                first = first/10;
            }
            if(first == last)
            {
                System.out.println(input+" IS A SPECIAL NUMBER");
            }
            else
            {
                System.out.println(input+" IS NOT A SPECIAL NUMBER");
            }
        }
    }
}