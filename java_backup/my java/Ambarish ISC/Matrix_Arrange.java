import java.io.*;
class Matrix_Arrange
{
int a[],i,n,j,f,f1,t,t1,max,min,k;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
Matrix_Arrange()throws IOException
{
    System.out.print("Enter terms");
    n=Integer.parseInt(br.readLine());
    a=new int[n];
    input();
}
void input()throws IOException
{
    for(i=0;i<n;i++)
    {
        a[i]=Integer.parseInt(br.readLine());
}
Arrange();
}
void Arrange()
{
    max=min=a[0];
    for(i=0;i<n;i++)
    {
        if(a[i]>max)
        max=a[i];
        else
        if(a[i]<min)
        min=a[i];
    }
        t=n/2;
        t1=t-1;
        f=0;f1=0;
        for(i=max;i>=min;i--)
        {
          for(j=0;j<n;j++)
          {
              if(i==a[j])
              {
                  if(f==0)
                  {
                      k=a[t];
                      a[t]=a[j];
                      a[j]=k;
                      f=1;
                      f1=0;
                      t++;
                      break;
                    }
                  else if(f1==0)
                  {
                     k=a[t1];
                      a[t1]=a[j];
                      a[j]=k;
                      f=0;
                      f1=1;
                      t1--;
                      break;
                    }
                }
            }
        }
        disp();
    }

void disp()
{
    for(i=0;i<n;i++)
    System.out.print(a[i]+",");
}
public static void main()throws IOException
{
    Matrix_Arrange ob=new Matrix_Arrange();
    //ob.input();
    //ob.Arrange();
    //ob.disp();
}
}
