import java.io.*;
public class sort
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[] = new int[10];int t = 0;
        System.out.println("ENTER THE ARRAY TO BE SORTED::");int min = 0;int t1=7979;
        for(int i = 0; i < 10; i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<(9-i);j++)
            {
                if(a[j]>a[j+1])
                {
                    t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        } if(true)
        {
            System.out.println();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=(i+1);j<10;j++)
            {
                if(a[i]>a[j])
                {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for(int i=0;i<9;i++)
        {
            min = i;
            for(int j=(i+1);j<10;j++)
            {
                if(a[j]<a[min])
                {
                    min = j;
                }
            }
            t = a[i];
            a[i] = a[min];
            a[min] = t;
        }
        System.out.println("the sorted array is:");
        for(int i = 0; i < 10; i++)
        {
            System.out.println(a[i]);
        }
    }

}