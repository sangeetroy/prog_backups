//To encypt a string to the sum of ASCII of the key
/*Example
   sen=akshay;
   key=ABC;
   acii sum of the key must be made till its of 1 digit
   A=65 B=66 C=67
   Now, 65+66+67=198
        1+9+8=18
        1+8=9
   So the alphabets of sen must be shifted to 9 places*/
import java.io.*;
class encrypting
{
    String sen,key;
    void Input(String t,String m1)
    {
        sen=t;
        key=m1;
    }
    int CalcNum(String x1)
    {
        int n=0;
        for(int i=0;i<x1.length();i++)
            n=n+(int)x1.charAt(i);
            int k=0,t=n;
            while(n>9)
            {
                while(t>0)
                {
                    k=k+t%10;
                    t=t/10;
                }
                n=k;
                t=n;
                k=0;
            }
        return n;
    }
    void Encrypt()
    {
        String word="";
        int num=this.CalcNum(key);
        System.out.println(num);
        int m=0;
        for(int i=0;i<sen.length();i++)
        {
            if(sen.charAt(i)==' ')
                word=word+' ';
            else
            {
                m=(int)sen.charAt(i);
                if(m<94)
                {
                    m=m+num;
                    if(m>90)
                        m=64+(m-90);
                }
                else
                {
                    m=m+num;
                    if(m>122)
                        m=96+(m-122);
                }
            }
            word=word+(char)m;
        }
        //return word;
        System.out.println("Encrypted word : "+word);
    }
}

        