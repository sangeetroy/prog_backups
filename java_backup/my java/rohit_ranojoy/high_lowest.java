public class high_lowest
{
    public static void main(int n)
    {
        int max=0; int min=0;
        int k=0;
        max=min=n%10;
        while(n>0)
        {
            k=n%10;
            if(k>max)
            {
                max=k;
            }
            else if(k<min)
            {
                min=k;
            }
                n=n/10;
            }
            System.out.println("higest="+max);
            System.out.println("lowest="+min);
    }
}

        