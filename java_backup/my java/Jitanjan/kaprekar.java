import java.io.*;
class kaprekar
{
 public static void main()throws IOException
 {int i,k,n,n1,c,l,s,s1,s2,d,j=0;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     System.out.println("ENTER THE LOWER LIMIT");
     int p=Integer.parseInt(br.readLine());
     System.out.println("ENTER THE UPPER LIMIT");
     int q=Integer.parseInt(br.readLine());
     if(q>=3000)
     System.out.println("UPPER LIMIT SHOULD BE LESS THAN 3000");
     for(i=p;i<q;i++)
     {
         c=0;n1=i;n=n1;
         while(n1>0)
         {
             k=n1%10;
             c++;
             n1=n1/10;
         }
         l=n*n;
         s=0;k=1;
         while(k<=c)
         {
             d=l%10;
             s=(s*10)+d;
             l=l/10;
             k++;
         }
         s1=0;
         while(s>0)
         {
             k=s%10;
             s1=(s1*10)+k;
             s=s/10;
         }
         s=0;
         while(l>0)
         {
             k=l%10;
             s=(s*10)+k;
             l=l/10;
         }
         s2=0;
         while(s>0)
         {
             k=s%10;
             s2=(s2*10)+k;
             s=s/10;
         } 
         if((s1+s2)==i)
         {
             j++;
             System.out.println("kaprekar number............+"+i);
             
         }
     }
     System.out.println("Frequency of kaprekar numbers are ..........."+j);
             
 }
 
}