import java.io.*;
class MergeSort
{
    BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
    int i=0,j=0,t=0,a[],b[],c[],n,m,temp,k;
    public void sort()throws IOException
    {
        int a[]=new int[100];
        int b[]=new int[100];
        int c[]=new int[100];
        System.out.println("Enter nos. of elements of first array");
            n=Integer.parseInt(br.readLine());
            System.out.println("Enter nos. of elements of second array");
            m=Integer.parseInt(br.readLine());
            i=0;
        while(i<n)
        {
            System.out.println("Enter element of first array");
            a[i]=Integer.parseInt(br.readLine());
            i++;
        }
        j=0;
        while(j<m)
        {
            System.out.println("Enter element of second array");
            b[j]=Integer.parseInt(br.readLine());
            j++;
        }
        i=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(i=0;i<n;i++)
        System.out.println(a[i]);
        i=0;
        j=0;
        for(i=0;i<m-1;i++)
        {
            for(j=i+1;j<m;j++)
            {
                if(b[i]>b[j])
                {
                    temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
         for(i=0;i<m;i++)
        System.out.println(b[i]);
        i=j=k=0;
        t=0;
            while(i<n && j<m)
            {
            if(a[i]<b[j])
            {
                c[t]=a[i];
                i++;
                t++;
            }
            else
            if(a[i]>b[j])
            {
                c[t]=b[j];
                j++;
                t++;
            }
            else
            {
                c[t]=b[j];
                j++;
                i++;
                t++;
            }
        }
        if(i<n)
        {
            while(i<n)
            {
                c[t]=a[i];
                i++;
                t++;
            }
        }
        else
        if(j<m)
        {
            while(j<m)
            {
                c[t]=b[j];
                j++;
                t++;
            }
        }
        System.out.println("Sorted array is:");
        for(i=0;i<n+m;i++)
        {
            if(c[i]!=0)
            System.out.print(c[i]+" ");
        }
    }
    public void main()throws IOException
    {
        sort();
    }
}