class Hcf
{
   int x,y;
   Hcf(int m,int n)
   {
       x=m;
       y=n;
       cal(x,y);
    }
       void cal(int x,int y)
       {
           while(x%y!=0)
           {
               int k=x%y;
               x=y;
               y=k;
            }
               System.out.println(y);
            }
            public static void main(String args[])
            {
                Hcf obj=new Hcf(30,20);
            }
        }
    