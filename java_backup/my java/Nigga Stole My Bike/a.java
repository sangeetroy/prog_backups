class a
{
    void b(String s)
    {
        int sp=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            sp++;
        }
        int c=0;
        String w[]=new String[sp];
        for(int i=0;i<sp;i++)
        w[i]="";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            c++;
            w[c]=w[c]+s.charAt(i);
        }
        
        for(int i=0;i<=c;i++)
        {
            System.out.println(ar(w[i])+" ");
        }
    }
    
    String ar(String s)
    {
        String w="";
        char a[]={'a','e','i','o','u'};
        s=s.toLowerCase();
        for(int i=0;i<a.length;i++)
        {
            for( int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==a[i])
                {
                    w=w+s.charAt(i);
                }
            }
        }
        
        char b[]={'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        for(int i=0;i<a.length;i++)
        {
            for( int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==b[i])
                {
                    w=w+s.charAt(i);
                }
            }
        }
        return w;
    }
}