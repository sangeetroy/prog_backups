import java.io.*;
class Sort1
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int t=0;
        int j,i;
        int a[]=new int[n];
        for( i=0;i<n;i++)
        a[i]=Integer.parseInt(br.readLine());
        for( i=0;i<n-1;i++)
        {
            for(j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }     
        }
       for( i=0;i<n;i++)
        System.out.println(a[i]);
    }
}

                
            
            
       
        