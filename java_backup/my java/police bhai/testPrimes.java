import java.io.*;
class testPrimes
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        primes obj=new primes(20,20);
        for(int i=0;i<20;i++)
        {
            System.out.println("enter number");
            int q=Integer.parseInt(br.readLine());
            obj.isPrime(q);
        }
        obj.fill();
        obj.display();
    }
}
    