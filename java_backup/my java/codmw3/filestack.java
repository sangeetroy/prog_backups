import java.io.*;
public class filestack
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    class stack
    {
        int a;
        void input()throws IOException
        {
            System.out.println("Enter number");
            a=Integer.parseInt(br.readLine());
        }
        stack next;
        
    }
    stack ob=new stack();
    stack ob2=ob;
    void start()throws IOException
    {
        FileOutputStream fout=new FileOutputStream("data.dat");
        DataOutputStream dout=new DataOutputStream(fout);
        while(true)
        {
            ob2.input();
            if(ob2.a==0)
            {
                break;
            }
           dout.writeInt(ob2.a);
            ob2.next=new stack();
            ob2=ob2.next;
                       
        }
     dout.close();
     fout.close();
    }
}


    
    
    