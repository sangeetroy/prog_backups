import java.util.*;
class encode
{
    String s="";
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a sentence ");
        s=sc.nextLine();
        System.out.print("Enter number ");
        n=sc.nextInt();
    }
    void encode()
    {
        String z="";
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            z=z+s.charAt(i);
            else
            {
                for(int j=0;j<z.length();j++)
                {
                    if(z.charAt(j)>=65&&z.charAt(j)<=90)
                    {
                        x=(int)z.charAt(j)+n;
                        if(x>90)
                         System.out.print((char)(91-x+64));
                        else if(x<65)
                        System.out.print((char)(90-64+x));
                        else
                        System.out.print((char)(x));
                    }
                    else if(z.charAt(j)>96&&z.charAt(j)<123)
                    {
                        x=(int)z.charAt(j)+n;
                        if(x>122)
                         System.out.print((char)(123-x+97));
                        else if(x<97)
                        System.out.print((char)(122-96+x));
                        else
                        System.out.print((char)(x));
                    }
                    else
                    System.out.print(z.charAt(i)+n);
                }
                System.out.print(" ");
                z="";
            }
        }
    }
    void decode()
    {
        n*=-1;
        String z="";
        int x=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            z=z+s.charAt(i);
            else
            {
                for(int j=0;j<z.length();j++)
                {
                    if(z.charAt(j)>=65&&z.charAt(j)<=90)
                    {
                        x=(int)z.charAt(j)+n;
                        if(x>90)
                         System.out.print((char)(91-x+64));
                        else if(x<65)
                        System.out.print((char)(90-64+x));
                        else
                        System.out.print((char)(x));
                    }
                    else if(z.charAt(j)>96&&z.charAt(j)<123)
                    {
                        x=(int)z.charAt(j)+n;
                        if(x>122)
                         System.out.print((char)(123-x+97));
                        else if(x<97)
                        System.out.print((char)(122-96+x));
                        else
                        System.out.print((char)(x));
                    }
                    else
                    System.out.print(z.charAt(i)+n);
                }
                System.out.print(" ");
                z="";
            }
        }
    }
    void main()
    {
        Scanner sc=new Scanner(System.in);
        input();
        int s;
        System.out.print("1 for encode 2 for decode ");
        s=sc.nextInt();
        if(s==1)
        encode();
        else
        decode();
    }
}
               