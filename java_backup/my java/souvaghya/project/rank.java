package project;

import java.io.*;
class rank
{
    public  void main( )throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String a[]=new String[10];
        int a1[]=new int[10];
        String s;
        int i,j,t;
        for(i=0;i<10;i++)
        {
           System.out.println("Enter name of student:");
            System.out.println("Enter marks of student:");
            a[i]=br.readLine();
            a1[i]=Integer.parseInt(br.readLine());
            
        }
        for(i=0;i<10-1;i++)
        for(j=i+1;j<10;j++)
        if(a1[i]<a1[j])
        {
            t=a1[i];
            a1[i]=a1[j];
            a1[j]=t;
            s=a[i];
            a[i]=a[j];
            a[j]=s;
        }
        for(i=0;i<10;i++)
         System.out.println("Rank:"+(i+1)+" "+"Name:"+a[i]+" "+"Marks"+a1[i]);
        }
    }