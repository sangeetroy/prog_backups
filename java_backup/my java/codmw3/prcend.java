import java.util.*;
public class prcend
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,k,l;
        String w,s;
        
        System.out.println("Enter code");
        s=sc.nextLine();
        a=(int)'a';
        b=(int)'z';
        c=(int)'A';
        d=(int)'Z';
        w="";
        
        for(k=0;k<s.length();k++)
         {
             w=w+s.charAt(k);
             l=Integer.parseInt(w);
            if(l>=a && l<=b)
            {
                System.out.println((char)l);
                w="";
            }
            else if(l>=c || l<=d)
            {
                System.out.println((char)l);
                w="";
            }
        }
    }
}
            
                
                
    
        
        
        
        
        