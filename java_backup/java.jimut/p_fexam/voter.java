import java.io.*;
class voter
{
public static void main(String[]args)throws IOException
{
InputStreamReader ab=new InputStreamReader(System.in);
BufferedReader cd=new BufferedReader(ab);
int av;
System.out.println("Enter age of voter:");
av=Integer.parseInt(cd.readLine());
if(((av==18)||(av>=18))&&(av<=100))
{
System.out.println("He is eligible to vote.");
}
else
{
System.out.println("He is not eligible to vote.");
}
}
}