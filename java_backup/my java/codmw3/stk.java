import java.util.*;
import java.io.*;
public class stk
{
    int a[],cc=-1;
    
    void input()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int fl,d,b,ch;
        fl=0;
        System.out.println("Enter limit");
        b=sc.nextInt();
        a=new int[b];
        
        int n=0;
        while (true)
        {
            System.out.println("To enter element press 1");
        System.out.println("To delete element press 2");
        System.out.println("To display file press 3");
        System.out.println("To display stack press 4");
        System.out.println("To terminate system press 5");
                    System.out.println("Enter choice");
            ch=sc.nextInt();
            fl=0;
            switch(ch)
           {
            case 1:
                   System.out.println("Enter data");
                   d=sc.nextInt();
                   push(d);
                   break;
             case 2:
                    pop();
                    n++;
                    break;
             case  3: display(n);
                      break;
             case  4: display1();
                     break;
             case 5:
                    System.exit(0);
                    
           }
    }
    //display(cn);
   }
   void  push(int d)
   {
       a[++cc]=d;
   }
   void pop()throws IOException
   {
       int st=a[cc];
       System.out.println("Popped element:"+st);
       cc--;
       file(st);
   }
   void file(int k)throws IOException
   {
       FileWriter fout=new FileWriter("data.txt",true);
       BufferedWriter bout=new BufferedWriter(fout);
       PrintWriter pout=new PrintWriter(bout);
       pout.println(k);
       pout.close();
       bout.close();
       fout.close();
    }
    void display(int n)throws IOException
    {
        int d;
        FileReader fin=new FileReader("data.txt");
        BufferedReader bin=new BufferedReader(fin);
        for(d=0;d<n;d++)
        {
            System.out.println(bin.readLine());
        }
    }
    void display1( )throws IOException
    {
        int d;
        FileReader fin=new FileReader("data.txt");
        BufferedReader bin=new BufferedReader(fin);
        for(d=cc;d>=0;d--)
        {
            System.out.println(a[d]);
        }
    }
}
    
    
    