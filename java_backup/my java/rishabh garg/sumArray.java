import java.io.*;
class sumArray
{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter size of the array");
        int n=Integer.parseInt (br.readLine());
        int a[] = new int[n];
        for (int i=0; i<n; i++)
        {
            System.out.println("Enter data");
            a[i]=Integer.parseInt(br.readLine());
        }
        int s=0;
        for (int i=0; i<n; i++)
        {
            s=s+a[i];
            System.out.println("Sum is "+s);
        }
    }
}
        