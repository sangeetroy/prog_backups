import java.util.*;
public class convO2N
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[126];
        System.out.println("octal no");
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            a[i]=(int)s.charAt(s.length()-1-i);
            a[i]=a[i]-48;
                        
        }
        double z=0;
        for(int i=0;i<s.length();i++)
        {
            z=z+(a[i]*Math.pow(8,i));
                   }
        System.out.println(z);
    }
}