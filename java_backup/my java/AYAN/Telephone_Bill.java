import java.io.*;
public class Telephone_Bill
{
 String c_name[],c_add[],phno[];int n;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void accept()throws IOException//customer data acception
    {
System.out.println("Enter no. of customers");
n=Integer.parseInt(br.readLine());
c_name=new String[n];c_add=new String[n];phno=new String[n];
for(int a=0;a<n;a++)
        {
System.out.println("Enter your name!");
c_name[a]=br.readLine();
System.out.println("Enter your address!");
c_add[a]=br.readLine();
System.out.println("Enter your phone no.");
phno[a]=br.readLine();
        }
    }
void show()//customer data enlisting
    {
System.out.println("Customer ID   Name                       Address                           Phone No");
System.out.println("-----------   ----                       -------                           --------");
for(int a=0;a<n;a++)
        {
if(a>9)
System.out.print((a+1)+"              ");
else
System.out.print((a+1)+"             ");
System.out.print(c_name[a]);
for(int b=0;b<(25-(c_name[a].length()));b++)
          {
System.out.print(" ");
            }
System.out.print(c_add[a]);
for(int c=0;c<(38-(c_add[a].length()));c++)
          {
System.out.print(" ");
            }
System.out.print(phno[a]);
System.out.println(" ");
        }
 System.out.println("");
    }
void get()throws IOException//only inputting phn no.
    {
System.out.println("Enter your phone no.");
String phn=br.readLine();
search(phn);
    }
void search(String phn1)throws IOException//searching phn no. only and showing customer details
    {
System.out.println("Customer ID   Name                       Address                           Phone No");
System.out.println("-----------   ----                       -------                           --------");
for(int a=0;a<n;a++)
        {
if(phno[a].equals(phn1)==true)
            {
if(a>9)
System.out.print((a+1)+"            ");
else
System.out.print((a+1)+"           ");
System.out.print(c_name[a]);
for(int b=0;b<(25-(c_name[a].length()));b++)
          {
System.out.print(" ");
            }
System.out.print(c_add[a]);
for(int c=0;c<(38-(c_add[a].length()));c++)
          {
System.out.print(" ");
            }
System.out.print(phno[a]);
System.out.println(" ");
            }
    }
    System.out.println(" ");
calculate();
    }
void calculate()throws IOException//calculating phone bill
    {
double cost;
System.out.println("Enter no. of calls");
int c=Integer.parseInt(br.readLine());
if(c<=150)
cost=c;
else if(150<c && c<=250)
cost=150+((c-150)*0.8);
else if(250<c && c<=350)
cost=150+(100*0.8)+((c-250)*0.6);
else
cost=150+(100*0.8)+(100*0.6)+((c-350)*0.5);
System.out.println("Bill Amount=Rs. "+(cost+250));
System.out.println(" ");
    }
public static void main(String args[])throws IOException
    {
BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
int x,f=1;
Telephone_Bill t= new Telephone_Bill();
while(true)
        {
System.out.println('\f');
System.out.println("Enter 1 for customer data acception");
System.out.println("Enter 2 for customer data display");
System.out.println("Enter 3 for searching phone no. & calculating bill amount");
System.out.println("Enter 4 for Exit");
 x=Integer.parseInt(r.readLine());
switch(x)
            {
case 1:
System.out.println('\f');
t.accept();
System.out.println("Press a key to continue");
char m=(char)r.read();
break;
case 2:
System.out.println('\f');
t.show();
System.out.println("Press a key to continue");
char n=(char)r.read();
break;
case 3:
System.out.println('\f');
t.get();
System.out.println("Press a key to continue");
char o=(char)r.read();
break;
case 4:
System.exit(0);
default:
System.out.println("Wrong choice");
                }
            }
        }
    }









