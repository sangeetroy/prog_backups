class square3
{
    public static void main()
    {
        int a,b,c,d;
        a=20;
        b=10;
        c=8;
        d=(((a+b)*(a+b))+((b+c)*(b+c))+((a+c)*(a+c)))/((a*a)+(b*b)+(c*c));
        System.out.println(d);
    }
}