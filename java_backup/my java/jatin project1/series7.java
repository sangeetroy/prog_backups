

import java.io.*;
class series7
    {
        public static void main(String args[])throws IOException
            {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int a,n;
                
                double s=0,k,i,k1;
                System.out.println("Enter limit:");
                   n=Integer.parseInt(br.readLine());
                   System.out.println("Enter number:");
                   a=Integer.parseInt(br.readLine());
                   k=2;
                   k1=2;
                for(i=1;i<=n;i++)
                    {
               s=s+k/Math.pow(a,k1);
               k1++;
               k=k+2;
            }
                
                System.out.println(s);
            }
        }