import java.io.*;
class telcall
{
    long phno;int n;String name;
    double amt;
 telcall(long x,String y,int k)
 {
     phno=x;
     //System.out.println("Enter the phone no.");
     name=y;
     //System.out.println("name");
     n=k;
    }
 void compute()
 {
     double k;
     if(n>=1&&n<=100)
     amt=500;
     else if(n>=101&&n<=200)
     amt=500+(n-100)*1.00;
     else if(n>=201&&n<=300)
     amt=500+(n-200)*1.20;
     else if(n>=300)
     amt=500+(n-300)*1.50;
    }
 void display()
 {   
     
     System.out.print("Phone no."+'\t'+'\t'+"Name"+'\t'+'\t'+"Total calls"+'\t'+'\t'+"Amt"+'\n');
     System.out.println(phno+'\t'+'\t'+'\t'+name+'\t'+'\t'+n+'\t'+'\t'+amt);
     
    }
    public static void main()throws IOException
    {
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int k;
       long x;
       String s;
       System.out.println("Enter Phone No:");
       x=Long.parseLong(br.readLine());
       System.out.println("Enter Name:");
       s=br.readLine();
       System.out.println("Enter Total Call:");
       k=Integer.parseInt(br.readLine());
       telcall t=new telcall(x,s,k);
       t.compute();
       t.display();
}
  }   
 /**
  * Enter Phone No:
9051875163
Enter Name:
Ambarish
Enter Total Call:
420
Phone no.		Name		Total calls		Amt
9051875163     Ambarish		420		       680.0
  */    