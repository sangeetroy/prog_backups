package date;

import java.io.*;
class btree
{
int x;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
btree()
{
x=0;
}
void input(int k)
{
x=k;
}
void disp()
{
System.out.println(x);
}
btree leftchild;
btree rightchild;
}