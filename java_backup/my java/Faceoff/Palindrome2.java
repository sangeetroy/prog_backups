import java.io.*;
class Palindrome2
{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s;
    void input()throws IOException
    {
        System.out.println("Enter String:");
        s=br.readLine();
        if(isPalindrome(s)==true)
        System.out.println("Palindrom");
        else
        System.out.println("Non Palindrom");
    }
    boolean isPalindrome(String s)
    {
        int f=0;
        for(int i=0, j=s.length()-1;i<s.length();i++,j--)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                f=1;
                break;
            }//End of i
        }//End of for
        if(f==0)
        return true;
        else
        return false;
    }//End of isPalindrome()
}//End of class

