import java.io.*;
class LL
{
public static void main(String[]args)
{
int k=8,m=11,r=7;
k+=(--m % 5) * (m++ * (10 + r++));
System.out.println("K="+k);
}
}