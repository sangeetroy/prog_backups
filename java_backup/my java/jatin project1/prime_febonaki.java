class prime_febonaki
    {
                public  void main()
                    {
                        
                    int a=100;
                    int b=101;
                    int s,i;
                    if(prime_check(a)==0)
                            System.out.print(a);
                            if(prime_check(b)==0)
                            System.out.print(b);
                    //System.out.print(a+","+b+",");
                    for(i=1;;i++)
                        {
                            s=a+b;
                            if(s>10000)
                            break;
                            else
                            if(prime_check(s)==0)
                            System.out.println(s);
                            a=b;
                            b=s;
                        }
                    }
                    int prime_check(int x)
                    {
                        int j,f;
                        f=0;
                        for(j=2;j<x;j++)
                        if(x%j==0)
                         {
                             f=1;
                             break;
                            }
                          if(f==0)
                           return 0;
                           else
                           return 1;
                        }
                }