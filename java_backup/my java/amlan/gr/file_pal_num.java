package gr;

import java.io.*;
class file_pal_num
{
 String filename="number";
 InputStreamReader isr=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(isr);
String bname,bcode,ch;
int i,n,k,c;
void input()throws IOException
{
FileOutputStream fw=new FileOutputStream(filename);
DataOutputStream dw=new DataOutputStream(fw);
System.out.println("Give term:");
n=Integer.parseInt(br.readLine());
for(i=1;i<=n;i++)
{
 System.out.println("Give number:");
k=Integer.parseInt(br.readLine());   
dw.writeInt(k);
}
dw.close();
fw.close();
disp();
store();
disp1();
}
void disp()throws IOException
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
System.out.println("The data....of File"+filename);
i=1;
while(i<=n)
{
k=de.readInt();
System.out.println(k);
i++;
}
} 
void store()throws IOException
{
FileInputStream fr=new FileInputStream(filename);
DataInputStream de=new DataInputStream(fr);
FileOutputStream fw1=new FileOutputStream("pal");
DataOutputStream dw1=new DataOutputStream(fw1);

System.out.println("The Palindrome data....of File"+filename);
int k1,s;
s=0;
i=1;
c=0;
while(i<=n)
{
k=de.readInt();
s=0;
k1=k;
while(k1>0)
{
s=(s*10)+k1%10;
k1=k1/10;
}
if(s==k)
{
    c++;
dw1.writeInt(k);
}
i++;
}
System.out.println("The total Palindrom data moved....of File"+c+","+filename);
dw1.close();
sort();
}  
void sort()throws IOException
{
FileInputStream fr=new FileInputStream("pal");
DataInputStream de=new DataInputStream(fr);
FileOutputStream fw1=new FileOutputStream("pal");
DataOutputStream dw1=new DataOutputStream(fw1);

System.out.println("The Palindrom data....of File"+"pal");
int k1,s,j,t;
s=0;
int a1[]=new int[100];
i=1;
System.out.println(c);
while(i<=c-1)
{
k=de.readInt();
a1[s++]=k;
i++;
}
de.close();
for(k1=0;k1<s-1;k1++)
for(j=k1+1;j<s;j++)
 if(a1[k1]>a1[j])
 {
    t=a1[k1];
    a1[k1]=a1[j];
    a1[j]=t;
}
for(k1=0;k1<s;k1++)
{
    dw1.writeInt(a1[k1]);
}
dw1.close();
}
void disp1()throws IOException
{
FileInputStream fr=new FileInputStream("pal");
DataInputStream de=new DataInputStream(fr);

System.out.println("The data....of File"+"pal");
i=1;
while(i<=n)
{
k=de.readInt();
System.out.println(k);
i++;
}
} 
}

  

