import java.util.*;
class kaprikar
{
    void clac()
    {
        int cr=0,i=0,r=0,n1=0,k=0,l=0;
        for(l=0;l<1000;l++)
        {
        r=l*l;
        n1=l;
        cr=0;
        while(n1>0)
        {
            cr++;
            n1=n1/10;
        }
        i=r%(int)Math.pow(10,cr);
        k=r/(int)Math.pow(10,cr);
        if((i+k)==l)
        System.out.println("Kaprikar"+" "+l);
        }
}
}