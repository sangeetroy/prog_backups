 import javax.swing.*;
//import java.sql.*;
import java.awt.Font;
import java.awt.event.*;
import java.io.*;
import java.applet.*;
public class libr10  extends JApplet  implements ActionListener
{
static JFrame frame;
static JPanel panel;
JLabel fn;
JLabel ln;
JLabel au;
JLabel cp;
JLabel  tp;
JLabel  tp1;
JLabel dp;
JLabel cd;
JLabel fn1;
JLabel ln1;
JTextField t1;
JTextField t2;
JTextField t3;
JButton b1;
public static void main(String args[])
{
new libr10();
}
public libr10()
{
panel=new JPanel();
Font font=new Font("Arial",Font.BOLD,12);
frame=new JFrame("Vender Report Mode");
frame.setVisible(true);
frame.setSize(300,150);
frame.getContentPane().add(panel);
b1=new JButton("END");

b1.addActionListener(this);
try
{
String filename="Vendor";
String ss,ss1,ss2,ss3,ss4,ss5,ss6,ss7,ss8,ss9;
boolean EOF=false;
int c;
FileInputStream fw=new FileInputStream(filename);
DataInputStream dw=new DataInputStream(fw);
while(!EOF)
{
ss=dw.readUTF();
ss1=dw.readUTF();
ss2=dw.readUTF();
ss3=dw.readUTF();
ss4=dw.readUTF();
ss5=dw.readUTF();
ss6=dw.readUTF();
ss7=dw.readUTF();
ss8=dw.readUTF();
ss9=dw.readUTF();
ln=new JLabel("Vender Code:"+ss);
fn=new JLabel("Vender Name:"+ss1);
au=new JLabel("Address:"+ss2);
tp=new JLabel("Contact No:"+ss3);
tp1=new JLabel("Contact No:"+ss4);
cp=new JLabel("Email:"+ss5);
dp=new JLabel("Type:"+ss6);
cd=new JLabel("Join Date:"+ss7);
fn1=new JLabel("Inital Deposit:"+ss8);
ln1=new JLabel("Registration No:"+ss9);
ln.setFont(font);
fn.setFont(font);
au.setFont(font);
tp.setFont(font);
tp1.setFont(font);
cp.setFont(font);
dp.setFont(font);
cd.setFont(font);
fn1.setFont(font);
ln1.setFont(font);
panel.add(ln);
panel.add(fn);
panel.add(au);
panel.add(tp);
panel.add(tp1);
panel.add(cp);
panel.add(dp);
panel.add(cd);
panel.add(fn1);
panel.add(ln1);
ss="";
ss1="";
ss2="";
ss3="";
ss4="";
ss5="";
ss6="";
ss7="";
ss8="";
}
dw.close();
}
catch(Exception ex)
{
System.out.println("Error"+ex);
}
panel.add(b1);
}
public void actionPerformed(ActionEvent e)
{
Object source=e.getSource();
if(source==b1)
{
frame.setVisible(false);
//System.exit(0);
}
}
}






