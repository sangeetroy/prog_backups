import java.io.*;
class String1
{
 public static void main(String Args[]) throws IOException
 { 
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     String a1[]=new String[100];
     String a,w;
     int i,k,t,j;
     t=0;
     System.out.println("Enter String:");
     a=br.readLine();
     w="";
     for(i=0;i<a.length();i++)
     {
         if(a.charAt(i)==' ')
         {
             a1[t++]=w;
             w="";
         }
         else
         if(a.charAt(i)=='.'||a.charAt(i)=='!'||a.charAt(i)==','||a.charAt(i)=='?')
         {
             w=w+a.charAt(i);
             a1[t++]=w;
             for(j=0;j<(t-1);j++)
             for(k=(j+1);k<t;k++)
             if(a1[j].compareTo(a1[k])>0)
             {
                 String S1=a1[j];
                 a1[j]=a1[k];
                 a1[k]=S1;
             }
             for(j=0;j<t;j++)
             System.out.println(a1[j]);
             w="";
             t=0;
         }
         else
         w=w+a.charAt(i);
     }
 }
}
              