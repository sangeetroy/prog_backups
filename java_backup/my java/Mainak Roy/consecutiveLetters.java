import java.util.*;
public class consecutiveLetters
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("string?");
        String n=sc.nextLine();
        char a[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int b[]=new int[26];
        n=n.toUpperCase();
        for(int i=0;i<26;i++)
        {
            for(int j=0;j<n.length();j++)
            {
                if(a[i]==n.charAt(j))
                {
                    b[i]++;
                }
            }
        }
        
        for(int i=0;i<25;i++)
        {
            int z=0;
            if(b[i]!=0 && b[i+1]!=0)
            {
            if(b[i]<b[i+1])
            {
                z=b[i+1];
            }
            else
            {
                z=b[i];
            }
            
            for(int k=z;k>0;k--)
            {
                System.out.print(" "+a[i]+a[i+1]);
            }
            System.out.println();
        }
    }
    }
}