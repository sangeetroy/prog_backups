import java.io.*;
class power
{
int i,p;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void input()throws IOException
{
p=Integer.parseInt(br.readLine());
i=Integer.parseInt(br.readLine());
System.out.println(power(p,i));
}
int power(int p,int i)
{
if(i==1)
return p;
else
return(p*power(p,i-1));
}
}


