//selection sort
import java.io.*;
class Sort
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int k=0;
        int pos,j,i;
        int a[]=new int[n];
        for( i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        for( i=0;i<n-1;i++)
        {
            pos=i;
            for(j=i+1;j<n;j++)
            {
                if(a[j]<a[pos])
                {
                    pos=j;
                }
            }
                k=a[i];
                a[i]=a[pos];
                a[pos]=k;
           
        }
       for( i=0;i<n;i++)
        System.out.println(a[i]);
    }
}


                
            
            
       