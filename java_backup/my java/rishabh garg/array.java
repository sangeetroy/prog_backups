import java.io.*;
class array

{
    public static void main (String args[])throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.println("Enter Size:");
        int n=Integer.parseInt (br.readLine());
        int a[] = new int [n];
        for (int i=0; i<n; i++)
        {
            System.out.println(" Enter data:");
            a[i] = Integer.parseInt (br.readLine());
        }
        int max, min;
        max=min=a[0];
        for (int i=0; i<n; i++)
        if (a[i]>max)
        {
            max=a[i];
        }
        else
        {
            if (a[i]<min)
            min = a[i];
        }
            System.out.println("Maximum is"+ max);
            System.out.println("Minimum is"+ min);
        }
    }

    
        
            