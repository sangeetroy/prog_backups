package project;
//Write a program in java to print the following series-1 2 3 5 8 13 21...N.
class series
{
    public static void main(int n)
    {
        int i;
        int a=1;
        int b=2;
        int c;
System.out.println(a+","+b+",");
        for(i=1;i<=n;i++)
        {
            c=a+b;
            System.out.println(c+",");
            a=b;
            b=c;
        }
    }
}