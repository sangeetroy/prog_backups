import java.io.*;
class chekk
{
    public static void main()throws IOException
    {
        int a,b,p,p1,k,k1,s1,s2;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of a:");
        System.out.println("Enter value of b:");
        a=Integer.parseInt(br.readLine());
         b=Integer.parseInt(br.readLine());
         p=a*b;
         s1=0;
         while(a>0)
         {
             k=a%10;
             s1=(s1*10)+k;
             a=a/10;
            }
            s2=0;
            while(b>0)
            {
            k1=b%10;
            s2=(s2*10)+k1;
            b=b/10;
        }
        p1=s1*s2;
        if(p==p1)
         System.out.println("Equal"+p+","+p1);
        else
          System.out.println("Not");
         
        }
    }
