class pattern
{
    public static void main(String ar[])
    {
        String s="INDIA";
        int sp=10;
        for(int i=s.length()-1;i>=0;i--)
        {
            for(int k=1;k<=sp;k++)
            System.out.print(" ");
            for(int j=i;j>=0;j--)
            System.out.print(s.charAt(j)+" ");
            System.out.println("");
            sp=sp+2;
        }
    }
}