import java.io.*;
public class transpose
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        transpose abc = new transpose();
        int a[][] = new int[4][4];
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            {
                System.out.println("enter element in row "+(i+1)+" column "+(j+1));
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }
        int b[][] = new int[4][4];
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            {
                b[i][j] = a[j][i];
            }
        }
        //System.out.println("");
        for(long i1 = 1;i1<=2000000000;i1++)
        {}
        System.out.println();
        System.out.println("THE ARRAY YOU ENTERED::");
        System.out.println();
        for(int i = 0 ; i < 4 ; i++)
        {
            for(int j = 0; j < 4 ; j++)
            {
                System.out.print("      "+a[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        for(long i1 = 1;i1<=2000000000;i1++)
        {}
        for(long i1 = 1;i1<=2000000000;i1++)
        {}
        System.out.println("THE TRANSPOSE OF THE ARRAY YOU ENTERED IS ::");
        System.out.println();
        for(int i = 0 ; i < 4 ; i++)    
        {
            for(int j = 0; j < 4 ; j++)
            {
                System.out.print("      "+b[i][j]);
            }
            System.out.println();
            System.out.println();
        }
        abc.dullas();
    }
    public void dullas()
    {
        System.out.println(":: MARRIAGE IS A PRIVATE AFFAIR ::");
    }
}
