class Magic
{
    public static void main(int n)
    {
        while(n>=10)
        {
            int s=0;
            int c=0,n1,k=n;
            while(k>c)
            {
                n1=k%10;
                s=s+n1;
                k=k/10;
            }
            n=s;
        }
        if(n==1)
        System.out.println("MAGIC");
        else
        System.out.println("NOT MAGIC");
    }
}

            