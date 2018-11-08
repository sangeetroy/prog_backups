import java.io.*;
public class sqm
{
    DataInputStream in=new DataInputStream(System.in);
    int a[][];
    int a2[][];
    int b[],c[];
    int n;
    int f=-1;
    int r=-1;
    int p=0;
    void input() throws IOException
    {
        System.out.println("side");
        n=Integer.parseInt(in.readLine());
        a=new int[n][n];
        a2=new int[n][n];
        b=new int[n*n];
        c=new int[n*n];
    }
    void push(int k)
    {
                    b[++p]=k;
                }
    void pop()
    {
        b[p]=-1;
        p--;
    }
    void insert(int k)
    {
        if(f<0)
        {
            c[++f]=k;
            r++;
        }
        else
        {
            c[++r]=k;
        }
    }
    void del()
    {
        c[f]=-1;
        f++;
    }
    void chk()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n*n;k++)
                {
                    if(a[i][j]==b[k])
                    a[i][j]=0;
                    if(a[i][j]==c[k])
                    a[i][j]=0;
                }
            }
        }
    }
    void display()
    {
        for(int i=n*n-1;i>=0;i--){
        if(c[i]==-1)
        continue;
        System.out.println("q "+c[i]);
    }
        for(int i=p;i>=0;i--){
        if(b[i]==-1)
        continue;
        System.out.println("s "+b[i]);
    }
        
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(" "+a[i][j]);
        }
        System.out.println();
    }
}
    void impl() throws IOException
    {
        input();
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=Integer.parseInt(in.readLine());
                a2[i][j]=a[i][j];
            }
        }
        i=0;j=-1;
        for(;;)
        {
            j++;
            if(j==n)
            {
                i++;
                j=0;
            }
            if(i==n)
            break;
            
            System.out.println("1-q push 2-q pop 3-s push 4-s pop 5-display");
            int ch=Integer.parseInt(in.readLine());
            switch(ch)
            {
                case 1:
                insert(a[i][j]);
                break;
                case 2:
                del();
                break;
                case 3:
                push(a[i][j]);
                break;
                case 4:
                pop();
                break;
            }
            
            for(int i2=0;i2<n;i2++)
            {
                for(int j2=0;j2<n;j2++)
                {
                    a[i2][j2]=a2[i2][j2];
                }
            }
            chk();
            if(ch==5)
            display();
        }
    }
}
    