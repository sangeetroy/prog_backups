import java.io.*;
class carmstrong
{
    int n;
    
    
        carmstrong(int a)
        {n=a;
            
            check(n);
        }
        void check(int s)
        {
            int j,k,m;
            j=s;
            m=0;
            while(j>0)
            {
                k=j%10;
                m=m+(k*k*k);
                j=j/10;
            }
            if(s==m)
            System.out.println("Armstrong:"+s);
        }
        public static void main(String args[])throws IOException
        {
            int l;
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter value:");
            l=Integer.parseInt(br.readLine());
            
                carmstrong a=new carmstrong(l);
            
        }
    }

                
        
                
            
    