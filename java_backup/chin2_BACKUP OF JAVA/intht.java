import java.io.*;

class intht
{
 int accno;
 float balance;
 public intht()
 {
     
 }
  public intht(int b, int acc)
 {
     balance=b;
     accno=acc;
 }
 public intht(int a , float b)
 {
     accno=a;
     balance=b;
 }
 public void withdraw(float amt)
 {
     balance=balance-amt;
 }
 public void deposit(float amt)
 {
     balance=balance+amt;
 }
}

class interest extends intht
{
    int r=0,t=0;
    float si=0;
    public interest(){} 
    public interest(int x ,  int y, int bal, int acc){
    super(bal,acc);
    r=x;t=y;
    }
    public void cal(){
    si=(balance*r*t)/100;
    balance=balance+si;
    }
    public void disp()
    {
        System.out.println("the present amt is " + balance);
    }
    public static void main(String args[])
    {
        interest p = new interest(5,2,5000,1);
        p.disp();
        p.cal();
        p.disp();
        p.withdraw(100);
        p.disp();
        p.deposit(200);
        p.disp();
    }
}
