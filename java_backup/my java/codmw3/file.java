import java.util.*;
import java.io.*;
public class file
{
    void main()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        FileOutputStream fs=new FileOutputStream("data.txt");
  
        System.out.println("Enter limit");
        a=sc.nextInt();
        
        for(b=0;b<a;b++)
        {
            System.out.println("Enter data");
            fs.write(sc.nextInt());
        }
        fs.close();
        FileInputStream fs1=new FileInputStream("data.txt");
        int k;
        for(b=0;b<a;b++)
        {
            System.out.println(k=(int)fs1.read());
        }
    }
}
        
        
        