

import java.io.*;
class program2
{
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  String s,s1="";char w;
  int i,j,c=0,c1=0;
  void input()throws IOException
  {
      System.out.println("Enter the sentence");
      s=br.readLine();
      s=s+" ";
    }
  void arrange()
  {
      for(i=0;i<s.length();i++)
      {
          if(s.charAt(i)==' ')
          c++;
        }
        String a[]=new String[c];
      for(i=0;i<s.length();i++)
          {
              
              if(s.charAt(i)!=' ')
              {
                  if((int)s.charAt(i)<97)
                  s1=s1+(char)((int)s.charAt(i)+32);
                  else
                s1=s1+s.charAt(i);
                
              }
              else if(s.charAt(i)==' ')
              {
                  a[c1]=s1;
                  c1++;
                  s1="";
              }
            }
      String t = "";
     for(i=0;i<c;i++)
     {
       for(j=i+1;j<c;j++)
       {
          if(a[i].compareTo(a[j]) > 0)
          {
              t = a[i];
              a[i] = a[j];
             a[j] = t;
          }
       }
     }
     for(i=0;i<c;i++)
     System.out.print(a[i]+" ");
    }
    public static void main(String arg[])throws IOException
    {
        
        program2 p=new program2();
        p.input();
        p.arrange();
    }
}
