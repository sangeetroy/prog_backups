import java.io.*;
class Program6
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int a,b,c;
        a=Integer.parseInt(br.readLine());
        b=Integer.parseInt(br.readLine());
        c=Integer.parseInt(br.readLine());
        if((a*a)==(b*b)+(c*c));
        System.out.println("pythagorian triplet");
        System.out.println("not a pythagorian triplet");
    }
    
}    
