import java.util.*;
class interesting
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        int i,v=0;
        s=sc.nextLine();
        for(i=1;i<s.length();i++)
        if(s.charAt(i)=='A')
        v++;
        else if(s.charAt(i)=='a')
        v++;
        else if(s.charAt(i)=='E')
        v++;
        else if(s.charAt(i)=='e')
        v++;
        else if(s.charAt(i)=='I')
        v++;
        else if(s.charAt(i)=='i')
        v++;
        else if(s.charAt(i)=='O')
        v++;
        else if(s.charAt(i)=='o')
        v++;
        else if(s.charAt(i)=='U')
        v++;
        else  if(s.charAt(i)=='u')
        v++;
        System.out.print(v);
    }
}
        