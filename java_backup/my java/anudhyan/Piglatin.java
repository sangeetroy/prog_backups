import java.util.*;
class Piglatin
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        int i,v=0,p;
        p=0;
        for(i=0;i<s.length();i++)
        if(s.charAt(i)=='A'||s.charAt(i)=='a'||s.charAt(i)=='E'||s.charAt(i)=='e'||s.charAt(i)=='I'||
           s.charAt(i)=='i'||s.charAt(i)=='O'||s.charAt(i)=='o'||s.charAt(i)=='U'||s.charAt(i)=='u')
    {
         p=i;
        break;
    }
    for (i=p;i<s.length();i++)
    System.out.print(s.charAt(i));
    for(i=0;i<p;i++)
    System.out.print(s.charAt(i));
    System.out.print("AY");
}
}