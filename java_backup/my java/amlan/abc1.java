import java.io.*;
class abc1 extends abc
{
    int p,q,r;
    void insert()throws IOException
    {
        input();
        p=Integer.parseInt(br.readLine());
        q=Integer.parseInt(br.readLine());
    }
    void sum()
    {
        add();
        r=p+q;
        System.out.println(r);
    }
    public void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        abc1 a=new abc1();
        a.insert();
        a.sum();
    }
}
        