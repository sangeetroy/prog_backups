

import java.io.*;
class para_sort
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
        String s, w;
        int l, i, j, k, pos, a=0;
        void input(String args[])throws IOException
        {
            System.out.println("enter a paragraph");
            s=br.readLine();
            calc();
        }
        void calc()
        {
            l=s.length();
            a=0;
            for(i=0;i<l;i++)
            {
                if(s.charAt(i)=='!'||s.charAt(i)==','||s.charAt(i)=='.'||s.charAt(i)=='?')
                {
                    pos=i;
                }
                
                for(k=65;k<=90;k++)
                {
                    w="";
                    //System.out.println("ss"+s.charAt(a));
                    for(j=a;j<pos;j++)
                    {
                        
                        if(s.charAt(j)==' '||s.charAt(j)=='!'||s.charAt(j)==','||s.charAt(j)=='.'||s.charAt(j)=='?' )
                        {
                            //
                            if(w.charAt(0)==(char)k)
                            System.out.println(w);
                            else
                             if(w.charAt(0)==(char)(k+32))
                            System.out.println(w);
                            w="";
                        }
                        else
                        w=w+s.charAt(j);
                    }
                   if(s.charAt(j)==' '||s.charAt(j)=='!'||s.charAt(j)==','||s.charAt(j)=='.'||s.charAt(j)=='?' )
                        {
                            if(w.charAt(0)==(char)k)
                            System.out.println(w);
                            else
                             if(w.charAt(0)==(char)(k+32))
                            System.out.println(w);
                            w="";
                        }
                    
                 System.out.println(a);  
                }
                 a=pos + 1;
            }
        }
    }
    