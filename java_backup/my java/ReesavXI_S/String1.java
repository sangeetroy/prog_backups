import java.util.*;
class String1
{
    String s="";
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string ");
        s=sc.nextLine();
        s=s+" ";
    }
    void calc()
    {
        String z="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            z=z+s.charAt(i);
            else
            {
                String s1="";
                for(int j=0;j<z.length();j++)
                {
                    if(z.charAt(j)=='A'||z.charAt(j)=='E'||z.charAt(j)=='I'||z.charAt(j)=='U'||z.charAt(j)=='O'||
                    z.charAt(j)=='a'||z.charAt(j)=='e'||z.charAt(j)=='i'||z.charAt(j)=='u'||z.charAt(j)=='o')
                    s1=s1+z.charAt(j);
                }
                for(int k=0;k<z.length();k++)
                {
                    if(z.charAt(k)!='A'&&z.charAt(k)!='E'&&z.charAt(k)!='I'&&z.charAt(k)!='U'&&z.charAt(k)!='O'&&
                    z.charAt(k)!='a'&&z.charAt(k)!='e'&&z.charAt(k)!='i'&&z.charAt(k)!='u'&&z.charAt(k)!='o')
                    s1=s1+z.charAt(k);
                }
                System.out.print(s1+" ");
                z="";
            }
        }
    }
    void main()
    {
        input();
        calc();
    }
}