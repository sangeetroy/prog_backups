 

import java.io.*;
class btree_mast
{
btree b=new btree();
btree b1=new btree();
int x;
String y;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
void calc()throws IOException
{
btree b1=new btree();
y="YES";
b=null;
while(y.compareTo("YES")==0||y.compareTo("Yes")==0||y.compareTo("yes")==0)
{
System.out.println("Give a Value");
x=Integer.parseInt(br.readLine());
b=create(b,x);
System.out.println("Want another ? Type YES/Yes/yes :");
y=br.readLine();
}
b1=b;
System.out.println("Preeorder");
preorder(b1);
System.out.println("Inorder");
inorder(b1);
System.out.println("Postorder");
postorder(b1);
}
btree create(btree b,int x)throws IOException
{
if(b==null)
{
b=new btree();
b.input(x);
b.leftchild=null;
b.rightchild=null;
}
else
{
if(x<=b.x)
b.leftchild=create(b.leftchild,x);
else
if(x>b.x)
b.rightchild=create(b.rightchild,x);
}
return b;
}
void preorder(btree b1)
{
if(b1!=null)
{
b1.disp();
preorder(b1.leftchild);
preorder(b1.rightchild);
}
}
void inorder(btree b1)
{
if(b1!=null)
{
preorder(b1.leftchild);
b1.disp();
preorder(b1.rightchild);
}
}
void postorder(btree b1)
{
if(b1!=null)
{
preorder(b1.leftchild);
preorder(b1.rightchild);
b1.disp();
}
}
public static void main()throws IOException
{
btree_mast bm=new btree_mast();
bm.calc();
}
}
