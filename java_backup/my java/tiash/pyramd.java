class pyramd
{
    void main()
    {
        int i,j,p,k,Sp;
        Sp=15;
        for( i=1;i<=5;i++)
        {
            for( p=1;p<=Sp;p++)
            {
                System.out.print(" ");
            }
            for( j=i;j>=1;j--)
            {
                System.out.print(j+" ");
            }
            for( k=2;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println("");
            Sp=Sp-2;
        }
    }
}