import java.io.*;
public class c
{
public static void main(String args[])throws IOException
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int x=10;
       x = x+++x+x+++--x;
       System.out.println(x);
    }
}
