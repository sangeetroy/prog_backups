import java.util.*;
public class encode
{
    private String s;
    public void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER STRING= ");
        s=sc.nextLine();
        encoding();
    }
    public void encoding()
    {
        String temp="";
        int x=0;
        int j=0;
        
            while(x<=(s.length()-2))
            {
            temp=temp+s.charAt(x)+s.charAt(x+1);
            if(Integer.parseInt(temp)==32)
            {
                System.out.print(" ");
                x=x+2;
                temp="";
            }
            else
            if(Integer.parseInt(temp)<65)
            {
                temp=temp+s.charAt(x+2);
                x=x+3;
                System.out.print((char)(Integer.parseInt(temp))+" ");
                temp="";
            }
            else
            {
                System.out.print((char)(Integer.parseInt(temp))+" ");
                x=x+2;
                temp="";
            }
        }
        }
    }


                
            