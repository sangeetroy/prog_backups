import java.util.*;
class strng_play
{
    String s="";
    strng_play(String n)
    {
        s=n;
    }
    void clac()
    {
        int i=0,j=0,k=0,l=0;
        String z="";
        char temp;
        for(i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            z=z+s.charAt(i);
            else
            {
                
                
                for(k=65;k<=90;k++)
                {
                    for(j=0;j<z.length();j++)
                    {
                        if(z.charAt(j)=='A'||z.charAt(j)=='E'||
                        z.charAt(j)=='I'||z.charAt(j)=='O'||
                        z.charAt(j)=='U'||z.charAt(i)=='a'||z.charAt(i)=='e'||
                        z.charAt(i)=='o'||z.charAt(i)=='i'||z.charAt(i)=='u')
                        {
                            if((int)z.charAt(j)==k||(int)z.charAt(j)==(k+32))
                        System.out.println(z.charAt(j));
                    }
                }
            }
        }
        z="";

    }
}
}