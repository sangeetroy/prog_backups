import java.io.*;
public class addition
{
public static void main(String args[])throws IOException
{
int a,b,c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
a=Integer.parseInt(br.readLine());
b=Integer.parseInt(br.readLine());
c=a+b;
System.out.println(c);
}
}