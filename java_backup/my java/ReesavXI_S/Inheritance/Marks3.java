package Inheritance;
import java.util.*;
import java.io.*;
class Marks3 extends Student3
{
    int m1;
    int m2;
    int m3;
    int total;
    void input()throws IOException
    {
        Scanner sc=new Scanner(System.in);
        super.input();
        System.out.print("Enter marks1 ");
        m1=sc.nextInt();
        System.out.print("Enter marks2 ");
        m2=sc.nextInt();
        System.out.print("Enter marks3 ");
        m3=sc.nextInt();
        total=(m1+m2+m3);
        FileWriter fout=new FileWriter("Markstotal.txt");
        BufferedWriter bout=new BufferedWriter(fout);
        PrintWriter pout=new PrintWriter(bout);
        pout.println(total+" ");
        pout.close();
        bout.close();
        fout.close();
    }
}