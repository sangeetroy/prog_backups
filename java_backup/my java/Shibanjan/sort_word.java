import java.io.*;
class sort_word
{
    String txt;
    int len,i,j;
    int a[];
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void read_txt()throws IOException
    {
        System.out.println("Enter the word in Lower Case");
        txt=br.readLine();
        len=txt.length();
        a=new int[len];
        for(i=0;i<txt.length();i++)
        {
            a[i]=(int)(txt.charAt(i));
        }
    }
    void sort_txt()
    {
        int t;
        for(i=0;i<len;i++)
        for(j=0;j<len-i-1;j++)
        if(a[j]>a[j+1])
        {
            t=a[j];
            a[j]=a[j+1];
            a[j+1]=t;
        }
        System.out.println("The sorted word in alphabetical order is");
        display();
    }
    void change_txt()
    {
        for(i=0;i<len;i++)
        {
            if(a[i]==(int)'a'||a[i]==(int)'e'||a[i]==(int)'i'||a[i]==(int)'o'||a[i]==(int)'u'||a[i]==(int)'A'||a[i]==(int)'E'||a[i]==(int)'I'||a[i]==(int)'O'||a[i]==(int)'U')
            {
                a[i]=a[i]-32;
            }
        }
        System.out.println("The vowels converted to upper case is");
        display();
        System.out.println("The changed text is");
    }
    void display()
    {
        for(i=0;i<len;i++)
        {
            System.out.print((char)a[i]);
        }
        System.out.println();
    }
    public static void main(String arg[])throws IOException
    {
        sort_word sw=new sort_word();
        sw.read_txt();
        sw.sort_txt();
        sw.change_txt();
        sw.display();
    }
    
}