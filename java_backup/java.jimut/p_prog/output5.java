import java.io.*;
class output5
{
public static void main(int x,int y,int z)
{
int t=++x%3 + (y-- + ++x)%2;
System.out.println(t);
}
}