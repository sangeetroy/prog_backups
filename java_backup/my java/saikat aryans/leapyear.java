import java.io.*;
public class leapyear
{
    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int y;
        System.out.println("Enter data:");
        y=Integer.parseInt(br.readLine());
        if(y%4==0||y%400==0)
        System.out.println("y is a leap year");
        else
        System.out.println("y is not a leap year");
    }
}

