package Inheritence;


class result extends marks
{
    String EC1,EC2;int Gt;
    void input(String n,int r,int s,int a,int b,int c,int t,String e1,String e2,int e3)
    {
      super.input(n,r,s,a,b,c,t);
      EC1=e1;
      EC2=e2;
      Gt=e3;
    }
    void display()
    {   super.display();
        System.out.println("Extra Carricular 1 "+EC1);
        System.out.println("Extra Carricular 2 "+EC2);
        System.out.println("Grand Total "+Gt);
    }
    }