class Print2
{
    public static void main (int n)
    {
        int i,s,j,k;
        s =0;
        k =5;
        for (i =1 ;i <=n ;i ++)
        {
            s =s +k;
            k =(k *10) +5;
        }
        System.out.println (s);
    }
}