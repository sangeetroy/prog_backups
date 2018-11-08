package file_operation;
import java.io.*;
class arr_sort
{
    DataInputStream in=new DataInputStream(System.in);
    int arr[];int n;
    String arr1[];
    arr_sort(int s)
    {
        n=s;
        arr=new int[n];
        arr1=new String[n];
    }
    void write()throws IOException
    {
        FileOutputStream fout=new FileOutputStream("C://data.bin");
        DataOutputStream dout=new DataOutputStream(fout);
        FileOutputStream fout1=new FileOutputStream("C://names.bin");
        DataOutputStream dout1=new DataOutputStream(fout1);
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter name ");
            dout1.writeUTF(in.readLine());
            System.out.print("Enter marks ");
            dout.writeInt(Integer.parseInt(in.readLine()));
        }
    }
    void read()throws IOException
    {
        FileInputStream fin=new FileInputStream("C://data.bin");
        DataInputStream din=new DataInputStream(fin);
        FileInputStream fin1=new FileInputStream("C://names.bin");
        DataInputStream din1=new DataInputStream(fin1);
        int i=0;
        boolean eof=false;
        while(!eof)
        {
            try
            {
                arr1[i]=din1.readUTF();
                arr[i]=din.readInt();
                i=i+1;
            }
            catch(EOFException e)
            {
                eof=true;
            }
        }   
    }
    void sort()throws IOException
    {
        FileOutputStream fout=new FileOutputStream("C://data.bin");
        DataOutputStream dout=new DataOutputStream(fout);
        FileOutputStream fout1=new FileOutputStream("C://names.bin");
        DataOutputStream dout1=new DataOutputStream(fout1);
        int temp=0;
        String temp1="";
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    temp1=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp1;
                }
            }
            dout.writeInt(temp);
            dout1.writeUTF(temp1);
        }
    }
}
    