import java.io.*;
class test
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int a,b,c;
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        if(a==b&&a==c&&b==c)
        System.out.println("quadrilateral");
        else if(a==b||a==c||b==c)
        System.out.println("isoceles");
        else
        System.out.println("scalne");
    }
}