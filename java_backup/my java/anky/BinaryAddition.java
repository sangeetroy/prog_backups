import java.io.*;
class BinaryAddition
{
    BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    int n1,n2,sum=0,sm=0,c=0,i,j,t=-1;
    int arr[]=new int[20];
    void disp()throws IOException
    {
        System.out.println("Enter first number");
        n1=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        n2=Integer.parseInt(br.readLine());
        while(n1>0 || n2>0)
        {
            i=n1%10;
            j=n2%10;
            sm=i+j;
            if(sm>1)
            {
                sum=0;
                sum=c;
                arr[++t]=sum;
                c=1;
            }
            else
            {
                sum=sm+c;
                if(sum>1)
                {
                    sum=c;
                    arr[++t]=sum;
                    c=1;
                }
                else
                {
                    c=0;
                    arr[++t]=sum;
                }
            }
            n1=n1/10;
            n2=n2/10;
        }
        for(i=t-1;i>=0;i--)
        {
            System.out.print(arr[i]+"");
        }
    }
    void main()throws IOException
    {
        disp();
    }
}
        