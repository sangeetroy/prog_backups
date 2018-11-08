 import java.io.*;
class Signal
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String arr[]={"LM","RS","LRSM","LRMS","RLSM","RLMS"};
    int i,l,j,k;
    String s,w;
    public void encode()throws IOException
    {
        System.out.println("Enter signal");
        s=br.readLine();
        s=s.toUpperCase();
        l=s.length();
        for(i=0;i<l-2;i++)
        {
            w="";
            for(j=i;j<i+2;j++)
            {
                w=w+s.charAt(j);
            }
            if(w.compareTo(arr[0])>0)
            {
                System.out.println("A");
            }
            if(w.compareTo(arr[1])>0)
            {
                System.out.print("N");
            }
            else
            {
             for(l=i;l<i-4;l++)
             {
                w="";
                for(k=i;k<i+4;k++)
                {
                    w=w+s.charAt(k);
                }
                if(w.compareTo(arr[2])>0)
                {
                    System.out.print("C");
                }
                if(w.compareTo(arr[3])>0)
                {
                    System.out.print("E");
                }if(w.compareTo(arr[4])>0)
                {
                    System.out.print("L");
                }if(w.compareTo(arr[5])>0)
                {
                    System.out.print("T");
                }
             }
        }
         
    }
}
    public void main()throws IOException
    {
        encode();
    }
}
    