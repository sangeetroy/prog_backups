import java.util.*;
public class small
{
    public static void main (String args[])
    {
        int a, b, c;
        Scanner SC = new Scanner (System.in);
        System.out.println ("Enter one no.");
        a = SC.nextInt();
        System.out.println ("Enter other no.");
        b = SC.nextInt();
        c = a-b;
        if (c>0)
        System.out.println("a is greater");
        else
        System.out.println("b is greater");
    }
}
        