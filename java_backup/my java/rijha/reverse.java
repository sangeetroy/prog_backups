class reverse extends number
{
    int x,a,i,s;
    
    void input(int n)
    {
        x=n;
    }
    void display()
    {
       a =0;i=0;
        for(i=x;i>0;i=i/10)
        {
            a=i%10;
        s=(s*10)+a;
    }
    System.out.println("reverse"+s);
}
void cal()
{
    display();
}
}