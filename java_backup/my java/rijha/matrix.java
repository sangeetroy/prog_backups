import java.io.*;
public class matrix
{
    public static void main()throws IOException
    {
        char a[][];char c;int i,j,n,m;n=0;m=0;c=0;j=0;i=0;
        String ch1;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("enter the number of rows");
        m=Integer.parseInt(br.readLine());
        System.out.println("enter the number of coloumns");
        n=Integer.parseInt(br.readLine());
         System.out.println(n);
        a=new char[m][n];
        System.out.println("enter the elements into the array");
        for(i=0;i<m;i++)
        {
            //System.out.flush();
            for( j=0;j<n;j++)
            {
                //System.out.flush();
                ch1=br.readLine();
                a[i][j]=ch1.charAt(0);
                //System.out.flush();
            }
        }
        for(i=0;i<m;i++)
        {
            for( j=0;j<m;j++)
            {
               System.out.print(a[i][j]);
            }
            System.out.println("");
        } 
        for( i=0;i<m;i++)
      {  
        for(j=0;j<n;j++)
        {
            c=a[i][j];
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                a[i][j]='*';
                
                
            }
           
            
        }
    }
   for(i=0;i<m;i++)
        {
            for( j=0;j<n;j++)
            {
               System.out.print(a[i][j]);
            }
            System.out.println("");
        } 
}
}
                