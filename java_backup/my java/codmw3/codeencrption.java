import java.util.*;
public class codeencrption
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int st1,st2,st3,st4,st5,e,d;
        String a,c="";
        System.out.println("Enter the code");
        a=sc.nextLine();
        st1=(int)'a';
        st2=(int)'z';
        st3=(int)'A';
        st4=(int)'Z';
        st5=(int)' ';
        for(e=0;e<a.length();e=e+1)
        {
            c=c+a.charAt(e);
            d=Integer.parseInt(c);
            if(d>=st1 && d<=st2)
            {
                System.out.print((char)d);
                c="";
            }
            else if(d>=st3 && d<=st4)
            {
                System.out.print((char)d);
                c="";
            }
            else if(d==st5)
            {
                System.out.print((char)d);
                c="";
            }
        }
    }
}
    
    