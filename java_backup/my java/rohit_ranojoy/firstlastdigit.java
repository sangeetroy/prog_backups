public class firstlastdigit
{
    public static void main(int n)
    {
        int k;
        k=n%10;
        System.out.println("first digit="+k);
        int i=0;
        while(n>0)
        {
            i=n%10;
            n=n/10;
        }
            System.out.println("last digit="+i);
       
    }
}

  