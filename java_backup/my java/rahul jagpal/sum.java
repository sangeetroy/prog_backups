import java.io.*;
class sum
{
    public static void main(int n)
    {
        int i,j;
        j=5;
        for(i=1;i<=n;i++)
        {
            System.out.print(j);
            j=(j*10)+5;
        }
        System.out.println("");
    }
}