import java.io.*;
class Pallindrome
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int n,s,base=2,f=0,c=0;
    void show()throws IOException
    {
        int i,j,m,l;
        System.out.println("Enter numbers");
        n=Integer.parseInt(br.readLine());
        s=Integer.parseInt(br.readLine());
        for(i=0;i<s;i++)
        {
            j=-1;
            int k=n;
            int a[]=new int[100];
            int arr[]=new int[100];
            while(k>0)
            {
                j++;
                m=k%base;
                arr[j]=m;
                k=k/base;
                base++;
            }
            for(l=0;l<j;l++)
            {
                a[l]=arr[j];
                j--;
                if(a[l]!=arr[j])
                {
                    f=1;
                    s--;
                    break;
                }
            }
            if(f==0)
            {
                c++;
            }
        }
        if(c>1)
        {
            m=0;
            System.out.println(n);
            m++;
        }
    }
    public void main()throws IOException
    {
        show();
    }
}
        