class Duck
{
    public static void main(int n)
    {int k,c=0;
        for(int i=1;i<=n;i++)
        {
            k=n%10;
            if(k==0)
            c++;
            n=n/10;
        }//End of while
        if(c!=0)
        System.out.println("Duck number");
        else
        System.out.println("Not a duck number");
    }//End of main()
}//End of class