package project;

class ftoo
{
    public  void main1()
    {
        int l,k,j,i;
        l=1;
        k=5;
        for(i=1;i<=10;i++)
        {
            for(j=5;j>=l;j--)
            System.out.print(j);
            System.out.println(" ");
            for(j=1;j<=k;j++)
            System.out.print(j);
            
            l++;
            k--;
            System.out.println(" ");
        }
    }
}