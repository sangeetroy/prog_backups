class Print
{
    public static void main (int n)
    {
        int i,s,j;
        s =0;
        j =1;
        for (i =1;i <=n;i ++)
        {
            s =s +(int) Math.pow (j,j);
            System.out.println (s);
            j =j+2;
        }
        System.out.println (s);
    }
}