import java.io.*;
class recc
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    String s;int i=0;int f=0;int p=0;String w="";
    void insert()throws IOException
    {
        System.out.println("Enter your string");
        s=in.readLine();
        check(s,i);
    }
    void check(String s,int i)
    {
        if(i==s.length())
        return ;
        else
        if(i==s.length()-1)
        {
            
        System.out.println("Last word"+s.substring(p+1,s.length()));
        
        
       }
        else
        if(s.charAt(i)==' ')
        {
            p=i; f++;
            if(f==1)
            System.out.println("First word"+s.substring(0,p));
                 check(s,i+1);
            }
            else
            check(s,i+1);
            
        }
    }
                