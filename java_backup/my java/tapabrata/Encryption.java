import java.util.Scanner;
class Encryption
{
String Message;
String Encmsg;
Encryption()
{
Message="";
Encmsg="";
}
void readMessage()
{
Scanner in=new Scanner(System.in);
System.out.println(" Enter the message ");
Message=in.nextLine();
}
String Rot13(String s)
{
String emsg="";
for(int i=0;i<s.length();i++)
{
char c=s.charAt(i);
if(c>='a'&&c<='m')
c+=13;
else if(c>='A'&&c<='M')
c+=13;
else if(c>='n'&&c<='z')
c-=13;
else if(c>='N'&&c<='Z')
c-=13;
emsg=emsg+c;
}
return emsg;
}
void Encrypt()
{Encmsg=Rot13(Message);
}
void display()
{
System.out.println(" Encoded message " +Encmsg);
}
void main()
{
Encryption enc=new Encryption();
enc.readMessage();
enc.Encrypt();
enc.display();
}
}