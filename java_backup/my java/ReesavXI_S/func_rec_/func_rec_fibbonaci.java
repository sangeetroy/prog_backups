package func_rec_;

import java.util.*;
class func_rec_fibbonaci
{
    int n,i;
    func_rec_fibbonaci(int num)
    {
        n=num;
        i=0;
    }
    void fibb(int i)
    {
        int j=0;
        if(i>n)
        {
            System.out.print(n);
            return;
        }
        else
        {
            j=i;
            System.out.print(i+" ");
            fibb((i+j));
        }
    }
}
