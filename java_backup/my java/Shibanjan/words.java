import java.io.*;
class words
{
  public static void main(String arg[])throws IOException
  {
      String s;
      InputStreamReader read=new InputStreamReader(System.in);
      BufferedReader in=new BufferedReader(read);
      System.out.println("Enter a string");
      s=in.readLine();
      int l=s.length();
      for(int i=0;i<l;i++)
      {
          char a=s.charAt(i);
          if(a==' ')
          {
              System.out.println();
            }
              else
              {
              System.out.print(a);
            }
        }
      
    }
}