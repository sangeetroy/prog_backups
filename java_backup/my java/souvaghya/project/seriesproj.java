package project;

import java.io.*;
class seriesproj
{
    public  void main()throws IOException
     {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no.of elements:");
        int n,i,x;
        n=Integer.parseInt(br.readLine());
        x=Integer.parseInt(br.readLine());
        double s=0;
        for(i=1;i<n;i++)
        {
            s=s+(double)1/(double)(x+(i-1));
        }
        System.out.print(s);
    }
}
        