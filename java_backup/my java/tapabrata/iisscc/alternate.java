package iisscc;
import java.io.*;
class alternate
{//declaration of class
    public static void main(String args[])throws IOException
    {//defining the main method
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int l,ar[][],i,j,temp,k;//declaring variables
        System.out.println("Enter Size");
        l=Integer.parseInt(br.readLine());
        ar=new int[l][l];
        System.out.println("Enter value");
        for(i=0;i<l;i++)//creating the array
            for(j=0;j<l;j++)
                ar[i][j]=Integer.parseInt(br.readLine());
                System.out.println("original matrix");
           for(i=0;i<l;i++)
        {//sorting alternate rows and columns
          for(j=0;j<l;j++)
            System.out.print(ar[i][j]);
           System.out.println();  
        }
        for(k=0;k<l;k++)
          for(i=0;i<l-1;i++)
            for(j=i+1;j<l;j++)
            {
                if(k%2==0)
                {
                    if(ar[k][j]<ar[k][i])
                    {
                        temp=ar[k][j];
                        ar[k][j]=ar[k][i];
                        ar[k][i]=temp;
                    }
                }
                else
                {
                    if(ar[j][k]<ar[i][k])
                    {
                        temp=ar[j][k];
                        ar[j][k]=ar[i][k];
                        ar[i][k]=temp;
                    }
                }
            }
                    System.out.println("Sorted matrix");
        for(i=0;i<l;i++)
        {//displaying the sorted matrix
          for(j=0;j<l;j++)
            System.out.print(ar[i][j]);//printing the result
           System.out.println();  
        }
    }//end of main
    }//end of class
