import java.io.*;
class eminem
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,b,c=0;
        System.out.println("Enter a number :");
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        while(a%b!=0)
        {
            c=a%b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
}