package func_rec_;
import java.util.*;
class func_rec_HCF
{
    void HCF(int a,int b)
    {
        if(a%b==0)
        {
            System.out.println("HCF :-"+b);
            return;
        }
        else
        HCF(b,(b%a));
    }
}