import java.util.*;
public class array
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        int a,b,d,g,e=0;
        
        System.out.println("enter limit ");
        a=sc.nextInt();
        int c[]=new int[a];
        for(b=0;b<a;b=b+1)
        {
            System.out.println("Enter Value");
            c[b]=sc.nextInt();
        }
        for(d=0;d<a-1;d=d+1)
        {
            e=c[d]+c[d+1];
        for(g=0;g<a;g=g+1)
        {
            if(e==c[g])
            {
                System.out.println(+c[d]+","+c[d+1]);
            }
        }
    }
    String k="Happy";
    k="65"+k;
    System.out.println(k);
}
}
            
        
        