import java.util.*;
public class Bi2Oct
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("binary no");
        String b=sc.nextLine();
        int lkl=b.length()/3+1;
        String a[]=new String[lkl];
        int c=0;
        for(int i=0;i<b.length();i++)
        {
            a[c]=a[c]+b.charAt(i);
            if((i+1)%3==0)
             c++;
            }
        Bi2Oct obj=new Bi2Oct();
            for(int i=0;i<=c;i++)
            {
             obj.b2o(a[i]);
            }
        }
        
        public void b2o(String g)
        {
            int a1[]=new int[126];
            for(int i=0;i<g.length();i++)
        {
            a1[i]=(int)g.charAt(g.length()-1-i);
            a1[i]=a1[i]-48;
                        
        }
        double z=0;
        for(int i=0;i<g.length();i++)
        {
            z=z+(a1[i]*Math.pow(2,i));
                   }
        int f=(int)z;
        int a2[]=new int[126];
    int n=0;
    while(f>0)
    {
       a2[n]=(f%8);
      n++;
        f=f/8;
        
    }
    for(int i=n-1;n>-1;n--)
    {
        System.out.print(a2[n]);
   
    }
}
}
            