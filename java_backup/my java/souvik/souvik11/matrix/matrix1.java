package souvik11.matrix;

import java.io.*;
class matrix1
{
    public static void main(String args[])throws IOException
          {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          
              int n,i,j,s,s1;
              System.out.println("Enter n:");
                    n=Integer.parseInt(br.readLine());                      
                    
                        int a[][]=new int [n][n];  
                        for(i=0;i<n;i++)
                        {
                             for(j=0;j<n;j++) 
                             a[i][j]=Integer.parseInt(br.readLine()); 
                            }
                            s=s1=0;
                              for(i=0;i<n;i++)
                               {
                                   for(j=0;j<n;j++) 
                                   {
                                   s=s1+a[i][j];
                                   s1=s1+a[i][j];
                                }
                            }
                                System.out.println(s);
                            
                                  System.out.println(s);
                                }
                            }
                            
                                          