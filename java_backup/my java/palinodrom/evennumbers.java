class evennumbers
{
    public static void main ()
    {
        int S, SI,i;
        S=SI=0;
        for(i=10;i<=100;i+=1)
        {
            if (i%2==0)
            S=S+i;
            else
            SI=SI+i;
        }
        System.out.println(S);
        System.out.println(SI);
    }
}