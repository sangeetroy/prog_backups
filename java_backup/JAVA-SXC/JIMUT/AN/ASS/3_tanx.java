import java.io.*;
import java.lang.*;

class Trig
{
	long fact(int n)
    	{
        	int i;
		long f=1;
       		for(i=1;i<=n;i++)
        	    f*=i;
       		return f;
	}
	double conv_dtr(int deg)
	{	
		return ((deg*Math.PI)/180.0);
	}
	double sinx(double x) //n is precision param set to 10
	{
		int n=10;	//precision
		int i,k=1;
		double sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum-=(double)(Math.pow(x,k)/fact(k));
			}
			else
			{
				sum+=(double)(Math.pow(x,k)/fact(k));
			}
			k+=2;
		}
		return sum;
	}
	double cosx(double x)
	{
		int n=10;
		int i,k=0;
		double sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				sum-=(double)(Math.pow(x,k)/fact(k));

			}
			else
			{
				sum+=(double)(Math.pow(x,k)/fact(k));
			}
			k+=2;
		}
		return sum;
	}
	double tanx(double x)
	{
		return ((double)sinx(x)/cosx(x));
	}
}
class tanx
{
	public static void main(String args[])throws IOException
        {
                InputStreamReader ab = new InputStreamReader(System.in);
                BufferedReader cd = new BufferedReader(ab);
		Trig ob = new Trig();
		//System.out.println(ob.sinx(ob.conv_dtr(5)));
		System.out.println("x \t\t\t sin(x) \t\t\t cos(x) \t\t\t tan(x) \t\t actual tan(x)");
		int i=0;
		double rad_c;
		rad_c = ob.conv_dtr(i);
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println(i+"\t\t\t"+ob.sinx(rad_c)+"\t\t\t"+ob.cosx(rad_c)+"\t\t\t"+ob.tanx(rad_c)+"\t\t\t"+Math.tan(rad_c));
		for(i=5;i<=360;i+=5)
		{
			rad_c = ob.conv_dtr(i);
			System.out.println(i+"\t\t"+ob.sinx(rad_c)+"\t\t"+ob.cosx(rad_c)+"\t\t"+ob.tanx(rad_c)+"\t\t\t"+Math.tan(rad_c));
		}

	}
}
