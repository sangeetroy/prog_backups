import java.util.*;
class String_pat3
{
    String s;
    String_pat3(String n)
    {
        s=n;
    }
    void clac()
    {
        String z="";
        for(int i=0;i<s.length();i++)
         z=z+(int)s.charAt(i);
        for(int j=z.length()-1;j>=0;j--)
         System.out.print(z.charAt(j));
    }
}